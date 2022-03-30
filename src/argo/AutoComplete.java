package argo;

import java.util.Scanner;

public class AutoComplete {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
		switch(c) {
		case "n":
			System.out.println("Naver D2");
			return;
		case "N":
			System.out.println("Naver D2");
			return;
		default:
			System.out.println("Naver Whale");
		}
	}
}
