package argo.math;
import java.util.*;
public class NumberPlay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while(true) {
			int tmp = sc.nextInt();
			if(tmp==0) break;
			sb.append(getSum(tmp)+"\n");
		}
		System.out.print(sb);
	}
	static int getSum(int n) {
		int len = (int) Math.log10(n)+1;
		int sum = 0;
		for
		return sum;
	}
}
