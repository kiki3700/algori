package argo;

import java.util.Scanner;

public class SpeedFine {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		int diff = b-a;
		if(diff>=31) {
			System.out.println("You are speeding and your fine is $500.");
		}else if(diff>=21) {
			System.out.print("You are speeding and your fine is $270.");
		}else if(diff>=1) {
			System.out.println("You are speeding and your fine is $100.");
		}else {
			System.out.println("Congratulations, you are within the speed limit!");
		}
	}
}
