package argo;

import java.util.Scanner;

public class TeamDivide {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int ab= a+b;
		int cd = c+d;
		
		int diff1 = Math.abs(ab-cd);
		
		int ac = a+c;
		int bd = b+d;
		
		int diff2 = Math.abs(ac-bd);
		
		int ad = a+d;
		int bc = b+c;
		
		int diff3 = Math.abs(ad-bc);
		
		System.out.println(Math.min(diff1, Math.min(diff2, diff3)));
	}
}
