package argo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PartSum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int x1, x2, y1, y2;
		int[][] arr = new int[n+1][n+1];
		int[][] dp = new int[n+1][n+1];
		int[] ans = new int[m];

		for(int i = 1; i <=n; i++ ) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <=n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				dp[i][j]= dp[i][j-1]+dp[i-1][j]-dp[i-1][j-1]+arr[i][j];
			}
		}
		for(int i = 0 ; i < m ; i++) {
			st = new StringTokenizer(br.readLine());
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			ans[i] =  dp[x2][y2]-dp[x2][y1-1]-dp[x1-1][y2]+dp[x1-1][y1-1];
		}
		for(int i = 0 ; i <m ; i++) {
			System.out.println(ans[i]);
		}
	}
}
