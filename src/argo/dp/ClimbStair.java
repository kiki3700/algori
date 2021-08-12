package argo.dp;
import java.util.*;
public class ClimbStair {

    static int n;
    static int[] dp;
    static int[] arr;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dp = new int[n+1];
        arr = new int[n+1];
        for(int i=1; i<n+1; i++){
            arr[i] = sc.nextInt();
        }
        dp[0]=0;

        dp[1]=arr[1];
        if(n>1) dp[2]=dp[1]+arr[2];
        if(n>2) dp[3]=Math.max(arr[1]+arr[3], arr[2]+arr[3]);
        if(n>3) climb(4);

        System.out.print(dp[n]);
        
    }
    static void climb(int ind){
        if (ind==n+1) return;
        dp[ind] = Math.max(dp[ind-3]+arr[ind-1]+arr[ind],dp[ind-2]+arr[ind]);
        climb(ind+1);
    }
}