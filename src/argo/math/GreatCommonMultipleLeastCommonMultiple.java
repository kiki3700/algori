package argo.math;
import java.util.*;
import java.math.*;
public class GreatCommonMultipleLeastCommonMultiple {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gcd = gcd(a, b);
		System.out.println(gcd);
		System.out.print(a*b/gcd);
		
	}
	static int gcd(int n1, int n2) {
		if(n2==0) return n1;
		else return gcd(n2, n1%n2);
	}
	
}
