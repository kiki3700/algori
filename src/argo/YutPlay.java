package argo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class YutPlay {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int f = 0;
			for(int j = 0 ; j< 4; j++) {
				int tmp = Integer.parseInt(st.nextToken());
				if(tmp == 0) {
					f++;
				}
			}
			String ans = check(f);
			sb.append(ans+"\n");
		}
		br.close();
		System.out.println(sb.toString());
	}
	public static  String check(int f) {
		switch(f){
		case 0:
			return "E";
		case 1:
			return "A";
		case 2:
			return "B";
		case 3:
			return "C";
		default:
			return "D";
		}
	
	}
}
