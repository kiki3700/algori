package argo.dp;

import java.util.Scanner;

public class TileByTwo {
	static int[] arr = new int[1001];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr[1] = 1;
		arr[2] =3;

		System.out.print(search(n));
	}
	static int search(int n) {
		if(arr[n]!=0) return arr[n];

		return arr[n] = (search(n-1)%10007+2*search(n-2)%10007)%10007;
	}
}
