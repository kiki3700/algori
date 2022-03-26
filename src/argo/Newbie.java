package argo;

import java.util.Scanner;

public class Newbie {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int ref = sc.nextInt();
		int a = sc.nextInt();
		if(a<=2) {
			System.out.print("NEWBIE!");
		}else if(a<=ref) {
			System.out.print("OLDBIE!");
		}else {
			System.out.print("TLE!");
		}
	}
}
