package argo.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Scale {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[8];
		int[] acd = new int[8];
		int[] des = new int[8];
		for(int i = 0 ; i < 8;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			acd[i] = i+1;
			des[i] = 8-i;
		}
		if(Arrays.equals(arr, acd)) {
			System.out.println("ascending");
			return;
		}
		if(Arrays.equals(arr, des)) {
			System.out.println("descending");
			return;
		}
		System.out.print("mixed");
		
	}
}
