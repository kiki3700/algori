package argo.bitmask;

import java.util.Scanner;

public class OctalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuilder ansSb = new StringBuilder();
		for(int i = 0 ; i <str.length();i++) {
			
			String tmp = Integer.toBinaryString(str.charAt(i)-'0');
			StringBuilder sb = new StringBuilder(tmp);
			StringBuilder pre = new StringBuilder();
			while(pre.length()+sb.length()<3) {
				pre.append(0);
			}
			pre.append(sb);
			ansSb.append(pre);

		}
		String ans = ansSb.toString();
		while(ansSb.length()!=0 && ansSb.charAt(0)=='0') {
			ansSb.deleteCharAt(0);
		}
		if(ansSb.length()==0) {
			ansSb.append(0);
		}

		System.out.print(ansSb.toString());
	}
}
