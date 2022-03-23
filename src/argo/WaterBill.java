package argo;

import java.util.Scanner;

public class WaterBill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int p = sc.nextInt();
		long xBill = a*p;
		long yBill;
		if(p<=c) {
			yBill = b;
		}else {
			yBill = b+ (p-c)*d;
		}
		System.out.print(Math.min(xBill, yBill));
	}
}
