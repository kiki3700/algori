package argo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Multiply {
	static BufferedReader br;
	static BufferedWriter bw;
	public static void main(String[] args) throws NumberFormatException, IOException {
		br= new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		String b = br.readLine();
		int sum =0;
		for(int i = b.length()-1 ; i >=0 ;i--) {
			int tmp = b.charAt(i)-'0';
			bw.write(a*tmp+"\n");
		}
		bw.write(a*Integer.parseInt(b)+"\n");
		br.close();
		bw.flush();
		bw.close();
//		System.out.println(a);
	}
}
