package argo.math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class GreatestCommonFactor {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b=  Long.parseLong(st.nextToken());
		if( a< b) {
			long tmp = a;
			b = tmp;
			a=b;
		}
		while(b>0) {
			long tmp = b;
			b = a%b;
			a= tmp;
		}
		StringBuilder sb = new StringBuilder();
		while(a-->0) {
			bw.append("1");
		}
		bw.flush();
		br.close();
//		System.out.println(sb.toString());
	}
}
