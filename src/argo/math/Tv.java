package argo.math;
import java.util.*;
public class Tv {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int d = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		double x = Math.pow(d,2)/ (Math.pow(h, 2)+Math.pow(w, 2));
		System.out.println((int)Math.sqrt(x*Math.pow(h,2))+" "+(int)Math.sqrt(x*Math.pow(w,2)));
	}
}
