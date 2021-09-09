package argo.dp;
import java.util.*;
import java.io.*;
public class hotel {
	static int c;
	static int n;
	static int[] dp;
	static final int INF = 987654321;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer  st = new StringTokenizer(br.readLine()," ");
        c = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        dp = new int[c+101];
        Arrays.fill(dp, INF);
        dp[0]= 0;

        for(int i =0; i<n; i++) {
        	st = new StringTokenizer(br.readLine()," ");
        	int cost = Integer.parseInt(st.nextToken());
        	int cust =  Integer.parseInt(st.nextToken());
        	for(int j = cust; j< c+101; j++) {
        		dp[j]=Math.min(dp[j], cost + dp[j-cust]);
        	}
        }
        
        int ans = INF;
        for(int i = c; i<c+101; i++) ans = Math.min(ans, dp[i]);
        System.out.print(ans);

	}
    
}