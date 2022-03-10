package argo;

import java.util.Scanner;

public class GPACalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(getScore(sc.nextLine()));
	}
	static float getScore(String str) {
		switch(str) {
			case "A+":
				return 4.3f;
			case "A0":
				return 4.0f;
			case "A-":
				return 3.7f;
			case "B+":
				return 3.3f;
			case "B0":
				return 3.0f;
			case "B-":
				return 2.7f;				
			case "C+":
				return 2.3f;
			case "C0":
				return 2.0f;
			case "C-":
				return 1.7f;
			case "D+":
				return 1.3f;
			case "D0":
				return 1.0f;
			case "D-":
				return 0.7f;
			default:
				return 0f;
		}
	}
}
