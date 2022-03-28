package argo;

import java.util.Scanner;

public class IdentifyTea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = sc.nextInt();
		int a = 0;
		for(int i = 0 ;  i < 5; i++) {
			int tmp = sc.nextInt();
			if(tmp == ans) {
				a++;
			}
		}
		System.out.println(a);
	}
}
