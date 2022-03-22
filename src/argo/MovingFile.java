package argo;

import java.util.Scanner;

public class MovingFile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[2];
		int[] b = new int[2];
		a[0] = sc.nextInt();
		a[1] = sc.nextInt();
		b[0] = sc.nextInt();
		b[1] = sc.nextInt();
				
		System.out.println(Math.min(a[0]+b[1], a[1]+b[0]));
	}
}
