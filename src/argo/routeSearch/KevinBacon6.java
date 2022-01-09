package argo.routeSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class KevinBacon6 {
	static int INF = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n][n];
		
		for(int i =0 ; i < n ; i++) {
			for(int j = 0; j <n; j++) {
				if(i==j) arr[i][j]=0;
				else arr[i][j]=5001;
			}
		}
		for(int i = 0 ; i < m ; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken())-1;
			int to = Integer.parseInt(st.nextToken())-1;
			arr[from][to] = 1;
			arr[to][from] = 1;
		}

		for(int k = 0 ; k <n ; k++) {
			for(int i =0; i<n; i++) {
				for(int j = 0 ; j<n; j++) {
					arr[i][j] = Math.min(arr[i][j], arr[i][k]+arr[k][j]);
				}
			}
		}
		int min = INF;
		int[] ansArr = new int[n];
		for(int i =0 ; i < n ; i++) {
			int sum = 0;
			for(int j = 0; j <n; j++) {
				sum += arr[i][j];
			}
			ansArr[i] = sum;
			min = Math.min(min, sum);
		}
		for(int i = 0; i <n; i++) {
			if(ansArr[i]==min) {
				System.out.println(i+1);
				return;
			}
		}
	}
}
