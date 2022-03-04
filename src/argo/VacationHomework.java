package argo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VacationHomework {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(br.readLine());
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		br.close();
		int ac = a%c==0? a/c : a/c+1;
		int bd = b%d==0? b/d : b/d+1;
		System.out.println(l - Math.max(ac, bd));
	}
}
