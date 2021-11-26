package argo.math;
import java.util.*;
public class DivideBy2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long from = sc.nextLong();
		long to = sc.nextLong();
		long sum = 0;
		sum = fun(to)-fun(from-1);
		sc.close();
//		System.out.println("ans : "+fun(15));
		System.out.println(sum);
	}
	static long fun(long n) {
		long ans =n;
		for(long i = 2 ; i<=n; i*=2) {
			ans+=(n/i)*(i/2);
		}
		return ans;
	}
} 
