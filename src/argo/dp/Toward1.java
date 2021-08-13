package argo.dp;
import java.util.*;
public class Toward1 {
	static int n;
	static int[] dp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		dp = new int[n+1];
		dp[0]=0;
		dp[1]=0;
		for(int i = 2;i<=n;i++) {
			if(i%3==0&&i%2==0) {
				dp[i]=Math.min(dp[i/3], Math.min(dp[i/2], dp[i-1]))+1;
			}else if(i%3==0) {
				dp[i]=Math.min(dp[i/3], dp[i-1])+1;
			}else if(i%2==0) {
				dp[i]= Math.min(dp[i/2], dp[i-1])+1;
			}else {
				dp[i]=dp[i-1]+1;
			}
		}
		System.out.print(dp[n]);
	}
}
