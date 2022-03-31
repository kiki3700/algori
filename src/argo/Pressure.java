package argo;

import java.util.Scanner;

public class Pressure {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int k = sc.nextInt();
		int h = sc.nextInt();
		if(s+k+h>=100) {
			System.out.print("OK");
		}else {
			System.out.print(findMin(s,k,h));
		}
		sc.close();
	}
	static String findMin(int s, int k, int h) {
		if(s<k && s<h) {
			return "Soongsil";
		}
		if(k < s && k < h ) {
			return "Korea";
		}
		if(h < s && h < k) {
			return "Hanyang";
		}
		return "";
	}
}
