package argo.bruteForce;

import java.util.Scanner;

public class PartSeries {
	static double ans =0;
	static int n;
	static int s;
	static int[] arr;
	public static void main(String[] args) {
		Scanner  sc =new Scanner(System.in);
		n = sc.nextInt();
		s = sc.nextInt();
		arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			search(i , arr[i]);
		}
		System.out.print(ans);
	}
	
	static void search(int idx,  int sum) {
		if(sum ==s) ans++;
		if(n== idx+1) {
			return;
		}
		for(int i = idx+1 ; i<n; i++) {
			search(i, sum+arr[i] );
		}
		
	}
}

