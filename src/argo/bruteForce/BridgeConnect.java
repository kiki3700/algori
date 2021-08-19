package argo.bruteForce;
import java.util.*;
public class BridgeConnect {
	static int[][] dp = new int[30][30];
	static int n;
	static StringBuilder sb;
	public static void main(String[] args) {
		sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		for(int i = n ; i <n; i++) {
			int x= sc.nextInt();
			int y = sc.nextInt();
			sb.append(combi(x, y));
		}
		System.out.print(sb);
	}
	static int combi(int n , int r) {
		if(dp[n][r]>0) {
			return dp[n][r];
		}
		if(n==r || r ==0) {
			return dp[n][r]=1;
		}
		return combi(n-1, r-1)+combi(n-1,r);
	}
}
