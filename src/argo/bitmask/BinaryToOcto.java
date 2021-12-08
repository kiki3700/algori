package argo.bitmask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryToOcto {
	static BufferedReader br;
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		int len = str.length();
		int oct = 0;
		int idx = 0;
		if(str.equals("0")) {
			System.out.println(0);
			return;
		}
		for(int i  = len-1; i >=0; i-- ) {
			int tmp = Integer.parseInt(str.charAt(i)+"");
			oct += tmp*Math.pow(2, idx);
			idx++;
//			System.out.println(oct);
			if(idx %3==0) {
				idx = 0;
				sb.append(oct);
				oct=0;
			}
		}
		if(oct!=0) sb.append(oct);
		System.out.print(sb.reverse());
	}
}