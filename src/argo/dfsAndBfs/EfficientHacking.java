package argo.dfsAndBfs;
import java.util.*;
public class EfficientHacking {
	static int n;
	static int m;
	static boolean[][] graph;
	static boolean[] visit;
	static int[][] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		arr = new int[n+1][2];
		n = sc.nextInt();
		m = sc.nextInt();
		int max =0;
		StringBuilder sb = new StringBuilder();
		graph = new boolean[n+1][n+1];

		for(int i = 0; i <m; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			graph[to][from] = true; 
		}
		for(int i =0; i <n; i++) {
			visit = new boolean[n+1];
			int p = dfs(i);
			max = Math.max(max, p);
			arr[i][0]= i;
			arr[i][1]= p;
		}
		for(int i = 0 ; i <n; i++) {
			if(arr[i][1]==max) sb.append(i+" ");
		}
		System.out.println(sb);
	}
	static int dfs(int start) {
		Queue<Integer> q= new LinkedList<>();
		q.offer(start);
		visit[start] = true;
		int cnt=1;
		while(!q.isEmpty()) {
			int s = q.poll();
			for(int i = 0; i< n; i++) {
				if(graph[s][i]&&!visit[i]) {
					q.offer(i);
					visit[i]=true;
					cnt++;
				}
			}
		}
		return cnt;
	}
}
