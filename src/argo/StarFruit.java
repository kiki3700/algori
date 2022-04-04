package argo;

import java.util.Scanner;

public class StarFruit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt()-1;
		int t = sc.nextInt();
		int c = sc.nextInt();
		int p = sc.nextInt();
		int ans = n/t*c*p;
		sc.close();
		System.out.print(ans);
				
	}
}
