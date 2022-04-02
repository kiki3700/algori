package argo;

import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bYear = sc.nextInt();
		int bMonth = sc.nextInt();
		int bDay = sc.nextInt();
		int tYear = sc.nextInt();
		int tMonth = sc.nextInt();
		int tDay = sc.nextInt();
		
		sc.close();
		int age = 0;
		if(bMonth<tMonth) {
			age = tYear- bYear;
		}else if(bMonth == tMonth) {
			if(bDay <= tDay) {
				age = tYear - bYear;
			}else
				age = tYear - bYear-1;
		}else {
			age = tYear-bYear-1;
		}
			
		System.out.println(age);
		System.out.println(tYear-bYear+1);
		System.out.println(tYear-bYear);
		
		
	}
}
