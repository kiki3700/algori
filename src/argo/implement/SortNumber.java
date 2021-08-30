package argo.implement;
import java.util.*;
public class SortNumber {
	static int n;
	static Integer[] arr;
	static StringBuilder sb;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new Integer[n];
		sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);		
		for(int i = 0; i < n ; i++) {
			sb.append(arr[i]+"\n");
		}
		System.out.print(sb);
	}
	
}
