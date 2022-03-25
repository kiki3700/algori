package argo;

import java.util.Scanner;

public class Change {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = a*b;
		int change = sum - c;
		if (sum - c <0){
			change = 0;
		}
		System.out.println(change);
	}
}
