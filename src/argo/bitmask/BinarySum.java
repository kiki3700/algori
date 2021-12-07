package argo.bitmask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BinarySum {
	static BufferedReader br;
	public static void main(String[] args) throws IOException {
		br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Long a = Long.parseLong(st.nextToken(), 2);
		Long b = Long.parseLong(st.nextToken(), 2);
		
		Long ans = a+b;
		System.out.println(Long.toBinaryString(ans));
	}
}
