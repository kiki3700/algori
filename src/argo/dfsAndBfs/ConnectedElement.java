package argo.dfsAndBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class ConnectedElement {
	static int[][] arr;
	static boolean[] visit;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n  =Integer.parseInt(st.nextToken());
		arr = new int[n][n];
		visit = new boolean[n];
		int m = Integer.parseInt(st.nextToken());
		for(int i = 0; i < m ; i++) {
			st = new StringTokenizer(br.readLine());
			int f = Integer.parseInt(st.nextToken())-1;
			int t = Integer.parseInt(st.nextToken())-1;
			arr[f][t] = 1;
			arr[t][f] = 1;
		}
		int cnt = 0; 
		for(int i = 0 ; i < n; i++) {
				if((!visit[i])) {
//					System.out.println((i+1));
					cnt += search(i);
					
				

			}
		}
		System.out.println(cnt);
	}
	static int search(int r) {
		Stack<Integer> stack = new Stack<>();
		stack.add(r);
		visit[r] = true;
		while(!stack.isEmpty()) {
			int point = stack.pop();
			for(int i = 0 ; i < arr.length;i++) {
				if(arr[point][i]==1&&!visit[i]) {
					stack.add(i);
					visit[i] = true;
				}
			}
		}
		return 1;

	}
}
