package argo.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sigma {
	static BufferedReader br;
	public static void main(String[] args) throws IOException {
		br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Long a =Long.parseLong(st.nextToken());
		Long b =Long.parseLong(st.nextToken());
		Long diff = (b>a)?  b-a : a-b;
		
		System.out.println((a+b)*(Math.abs(diff)+1)/2);
	}
}
