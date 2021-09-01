package argo.dp;
import java.util.*;

public class FibonacciSeries{
	static Integer[][] dp;
	static int t;
	static StringBuilder sb;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		dp = new Integer[41][2];
		dp[0][0]=1;
		dp[0][1]=0;
		dp[1][0]=0;
		dp[1][1]=1;
		sb = new StringBuilder();
		for(int i = 0; i < t; i++) {
			int tmp = sc.nextInt();
			FF(tmp);
			sb.append(dp[tmp][0]+" "+dp[tmp][1]+"\n");
		}
		System.out.print(sb);
	}
	static Integer[] FF(int n) {
		if(dp[n][0]==null || dp[n][1]==null) {
			dp[n][0] = FF(n-1)[0]+ FF(n-2)[0];
			dp[n][1] = FF(n-1)[1]+ FF(n-2)[1];
		}
		return dp[n]; 
	}
}
