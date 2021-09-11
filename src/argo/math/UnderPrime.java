package argo.math;
import java.util.*;
public class UnderPrime {
	static int a;
	static int b;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		a= sc.nextInt();
		b = sc.nextInt();
		int cnt=0;
		for(int i = a; i<=b ; i++) {
			int num = getPrime(i);
			if(num>1) {
				if(checkPrime(num)) cnt++;
			}
		}
		System.out.print(cnt);
	}
	static int getPrime(int n) {
		int cnt =0;
		int i = 2;
		while(true) {
			if(n==1) break;
			if(n % i ==0) {
				n/=i;
				cnt++;
			}else {
				i++;
			}
		}
		return cnt;
	}
	static boolean checkPrime(int n) {
		for(int i =2 ; i <n ;i++ ) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
