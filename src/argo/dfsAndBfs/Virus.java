package argo.dfsAndBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Virus {
	static int[][] arr;
	static boolean[] visit;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		visit = new boolean[n];
		for(int i = 0 ; i < k ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken())-1;
			int to  = Integer.parseInt(st.nextToken())-1;
			arr[from][to] =1;
			arr[to][from] = 1;
		}
		int ans = dfs();
		System.out.print(ans);
		
		
	}
	static int dfs() {
		Stack<Integer> s = new Stack<>();
		int count = 0;
		s.add(0);
		visit[0]=true;
		while(!s.isEmpty()) {
			int tmp = s.pop();
			count++;
			for(int i = 0 ; i <arr.length;i++) {
				if(!visit[i]&&arr[tmp][i]==1) {
					s.add(i);
					visit[i]=true;
				}
			}
		}
		return count-1;
	}
}