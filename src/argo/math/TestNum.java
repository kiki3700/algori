package argo.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TestNum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = 0;
		for(int i = 0 ; i < 5; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			sum += Math.pow(tmp, 2);
		}
		System.out.print(sum%10);
	}
}
