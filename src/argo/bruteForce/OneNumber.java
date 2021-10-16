package argo.bruteForce;
import java.math.*;
import java.util.*;
public class OneNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for(int i  = 1; i <=n; i++) {
			if(checkOneNumber(i)) count++;
		}
		System.out.print(count);
//		System.out.print(checkOneNumber(124));
	}
	static boolean checkOneNumber(int n){
		
		int len = (int) Math.log10(n)+1;
		
		if( len <=2 ) return true;
		int a = n%10;
		int b = n%100/10;
		int diff = b-a;
		int c = a -diff;
		for(int i = 0; i< len ; i++) {
			int tmp = n %10;
			if((tmp-c)!= diff) {
				return false;
			}
			n /= 10;
			c = tmp;
		}
		return true;
	}
	

}
