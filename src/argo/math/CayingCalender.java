package argo.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CayingCalender {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		int len = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < len; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int ans = search(m, n, x, y);
			sb.append(ans+"\n");
		}
		System.out.println(sb.toString());
	}
	static int search(int m , int n, int x ,int y) {
		int MAX = lcm(m,n);
		int base = 0;
		for(int i = 0 ; base <= MAX; i++) {
			base = i*m +x;
			if((base-y)%n==0) return base;
		}
		return -1;
	}
	static int gcd(int a, int b) {
		while(b != 0) {
			int r = a%b;
			a = b;
			b = r;
		}
		return a;
	}
	static int lcm(int a, int b) {
		return a*b/gcd(a,b);
	}
}
