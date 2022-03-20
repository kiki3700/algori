package argo;

import java.util.Scanner;

public class AFC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		int sub = sc.nextInt();
		int a = (sum +sub)/2;
		int b = (sum-sub)/2;
		if(sum-sub<0 || (sum-sub)%2!=0) {
			System.out.print(-1);	
		}else if(sum == a+b) {
			System.out.print(Math.max(a,b)+" "+Math.min(a, b));
		}
	}
}
