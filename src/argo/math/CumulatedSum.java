package argo.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CumulatedSum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		double[] arr = new double[n+1];
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for(int i = 1 ; i <= n ; i++ ) {
			arr[i] = Integer.parseInt(st.nextToken())+ arr[i-1];
		};
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < m ; i++ ) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			double sum = arr[to] - arr[from-1];
			sb.append((int) sum+"\n");
		}
		System.out.println(sb.toString());
	}
}
