package argo;

import java.util.Scanner;

public class SpecialDays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();
		if(month<2) {
			System.out.println("Before");
		}else if(month>2){
			System.out.println("After");
		}else {
			if(day>18) {
				System.out.println("After");
			}else if(day<18) {
				System.out.println("Before");
			}else {
				System.out.println("Special");
			}
		}
	}
}
