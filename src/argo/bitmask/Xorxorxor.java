package argo.bitmask;

import java.util.Scanner;

public class Xorxorxor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		int c = sc.nextInt();
		if(c%2==0) System.out.println(a);
		else System.out.println(a^b);
	}
}