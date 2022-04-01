package argo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Empathy {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Long a = Long.parseLong(br.readLine(), 2);
		Long b = Long.parseLong(br.readLine(), 2);
		br.close();
		System.out.println(Long.toBinaryString(a*b));
	}
}
