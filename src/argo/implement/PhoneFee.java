package argo.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PhoneFee {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine()); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m =0;
		int y = 0;
		for(int i = 0 ; i <n; i++) {
			int tmp = Integer.parseInt(st.nextToken());
//			if(tmp %30==0) y += (tmp/30)*10; 
			 y += (tmp/30+1)*10;
//			if(tmp %60==0) m += (tmp/60)*15; 
			m += (tmp/60+1)*15;
		}
		if(y<m) System.out.println("Y "+y);
		else if(y>m) System.out.println("M "+m);
		else System.out.println("Y M "+ y);
//		System.out.println(m);
//		System.out.println(y);
	}
}
