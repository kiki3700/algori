package argo.string;
import java.util.*;
import java.math.*;
public class StringSeries {
	static String a;
	static String b;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a = sc.next();
		b= sc.next();
		int lenA = a.length();
		int lenB = b.length();
		System.out.print(addString(lenA, lenB));
	}
	static int addString(int lenA, int lenB) {
		int min = 500;
		for(int i = 0; i<=lenB-lenA; i++) {
			int cnt = 0;
			for(int j = i; j<i+lenA;j++) {
				if(a.charAt(j-i)!=b.charAt(j)) cnt++;
			}
			min = Math.min(cnt, min);
		}
		return min;
	}
}
