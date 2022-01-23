package argo.implement;

import java.util.HashMap;
import java.util.Scanner;

public class NByTwoTile {
	static HashMap<Long, Long> map = new HashMap<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long[] arr = new long[2001];
		arr[1] = 0;
		arr[1] = 1;
		arr[2] = 2;
		for(int i = 3 ; i <= n; i++) {
			long tmp = arr[i-1]+arr[i-2];
			arr[i] = tmp%10007;
		}
		System.out.println(arr[(int) (n)]);
	}

}
