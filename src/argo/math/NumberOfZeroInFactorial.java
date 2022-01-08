package argo.math;

import java.util.Scanner;

public class NumberOfZeroInFactorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = getSet(n);
		sc.close();
		System.out.print(ans);
		
	}
	static int getSet(int n) {
		int f=0;
		int t=0;
		for(int i =n ; i>1; i--) {
			int tmp = i;
			while((tmp%5==0)||(tmp%2==0)) {
				if(tmp%5==0) {
					f++;
					tmp /=5;
				}
				if(tmp%2==0) {
					t++;
					tmp/=2;
				}
			}
		}
		return Math.min(f, t);
	}
}
