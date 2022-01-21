package argo.math;

import java.util.Scanner;

public class ChessPeice {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		boolean odd = n%2!=0;
		int r;
		if(odd) r = n/2+2;
		else r=n/2+1;
				
		int c = n/2+1; 
		System.out.println(r*c);
	}
}
