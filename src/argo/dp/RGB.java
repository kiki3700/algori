package argo.dp;
import java.util.*;
public class RGB {
    static int n;
    static int[][] arr;
    static int[][] dp;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][3];
        for(int i =0; i<n;i++){
            arr[i][0]= sc.nextInt();
            arr[i][1]= sc.nextInt();
            arr[i][2]= sc.nextInt();             
        }
        dp = new int[n][3];
        dp[0][0]=arr[0][0];
        dp[0][1]=arr[0][1];
        dp[0][2]=arr[0][2];
        solve(1);
        int ans = Math.min(dp[n-1][0],dp[n-1][1]);
        ans = Math.min(ans,dp[n-1][2]);
        System.out.print(ans);
    }
    static void solve(int index){
        if(index==n) return;
        
        dp[index][0]= Math.min(dp[index-1][1],dp[index-1][2])+arr[index][0];
        dp[index][1]= Math.min(dp[index-1][0],dp[index-1][2])+arr[index][1];
        dp[index][2]= Math.min(dp[index-1][1],dp[index-1][0])+arr[index][2];
        solve(index+1);
    }
}