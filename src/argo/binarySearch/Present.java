package argo.binarySearch;
import java.util.*;
public class Present {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long l = sc.nextInt();
		long w = sc.nextInt();
		long h = sc.nextInt();
		double low = 0;
		double high = Math.max(l, Math.max(w, h));
		for(int i = 0; i< 1000; i++) {
			double mid = (low + high)/2;
			if((long)(l/mid)*(long)(w/mid)*(long)(h/mid)>=n) { 
				low =mid;
			}else {
				high = mid;
			}
		}
		System.out.print(high);
	}	
}
