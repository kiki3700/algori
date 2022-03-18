package argo;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a+b+c!=180) {
			System.out.print("Error");
		}else if(a!=b&&a!=c&&b!=c) {
			System.out.println("Scalene");
		}else if(a==b&& a==c) {
			System.out.println("Equilateral");
		}else {
			System.out.print("Isosceles");
		}
	}
}
