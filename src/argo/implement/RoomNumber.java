package argo.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class RoomNumber {
	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		String str = br.readLine();
		for(int i = 0 ; i < str.length();i++) {
			int tmp = str.charAt(i)-'0';
			arr[tmp]++;
		}
		int k = (arr[6] + arr[9]);
		if(k % 2==0) {
			arr[6] = k/2;
			arr[9] = k/2;
		}else {
			arr[6] = k/2+1;
			arr[9] = k/2+1;
		}
		int max = 0;
		for(int i : arr) {
			max = Math.max(max, i);
		}
		System.out.println(max);
	}
	public static void main(String[] args) throws IOException {
		solution();
	}
}
