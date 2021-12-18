package argo.math;

import java.util.Scanner;

public class Bird {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		int cnt = 0;
		int sum = 0;
		int dx =0;
		while(n>0) {
			if(n<=dx) dx=0;
			dx++;
			n-=dx;
						
			cnt++;
		}
		System.out.println(cnt);
	}
}
