package argo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SnakeAndLadderGame {
	static int[] arr = new int[101];
	static boolean[] visit= new boolean[101];
	static int[] count = new int[101];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		for(int i = 0; i <n+m;i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			arr[u] = v;
		}
		Queue<Integer> q = new LinkedList<>();
		q.offer(1);
		count[1]=0;
		visit[1] = true;
		while(!q.isEmpty()) {
			int now = q.poll();
			if(now == 100) {
				System.out.println(count[now]);
				break;
			}
			
			for(int i = 1; i<=6; i++) {
				int next= now +i;
				if(100 < next || visit[next]) continue;
				
				if(arr[next]!=0) {
					if(!visit[arr[next]]) {
						visit[next] = true;
						count[arr[next]] = count[now]+1;
						q.offer(arr[next]);
					}
				}else {
					visit[next] = true;
					count[next] = count[now]+1;
					q.offer(next);
				}
			}
		}
	}
}
