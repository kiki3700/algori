package argo.string;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Conttact {
	public static void main(String[] args) {
		String pattern = "(100+1+|01)+";
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0 ; i< n;i++) {
			String tmp = sc.next();
			if(Pattern.matches(pattern, tmp)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}
