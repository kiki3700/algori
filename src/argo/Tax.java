package argo;

import java.util.Scanner;

public class Tax {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int in = sc.nextInt();
		double a = in-in*0.22;
		double b = in*0.8+((in*0.2)-(in*0.2*0.22));
		System.out.print((long) a);
		System.out.print(" ");
		System.out.print((long) b);
	}
}
