package argo.dfsAndBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class HideAndSeek {
	static Set<Integer> visit;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		if(t<n) {
			System.out.print(n-t);
			return;
		}else if(n==t) {
			System.out.println(0);
			return;
		}
		int ans = bfs(n,t);
		System.out.println(ans);
	}
	static int bfs(int n , int t) {
		Queue<Integer> q = new LinkedList<>();
		int[] visit = new int[100001];
		q.add(n);
		visit[n] =1;
		while(!q.isEmpty()) {
			int a = q.poll();		
			for(int i = 0 ; i < 3; i++) {
				int next = 0;
				if(i == 0) next = a-1;
				if(i == 1) next = a+1;
				if(i == 2) next = a*2;
				if(next == t) return visit[a];
				if(100000>=next&&next>=0) {
					if(visit[next]==0) {
						q.add(next);
						visit[next] = visit[a]+1;
					}
				}
			}

		}
		return 0;
	}
}
