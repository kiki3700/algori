package argo.dfsAndBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class FindPath{
	static int[][] arr;
	static boolean[] visited;
	static int n;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		for(int i = 0 ; i < n ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < n ; j++) {
				arr[i][j]= Integer.parseInt(st.nextToken());
			}
		}
		for(int i = 0 ; i < n; i++) {
			visited = new boolean[n];
			for(int j = 0; j< n ; j++) {
				if(arr[i][j]==1 && !visited[j]) {
					bfs(i, j);
				}
			}
		}
		for(int i = 0 ; i <n; i++) {
			for(int j = 0 ; j < n ; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	static void bfs(int from, int to) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(to);
	
		while(!q.isEmpty()) {
			int val = q.poll();
			for(int i = 0 ; i <n; i++) {
				if(!visited[i]&& arr[val][i]==1) {
					q.add(i);
					arr[from][i] = 1;
					visited[i]= true;
				}
			}
		}
	}
}