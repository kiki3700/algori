package argo.greedy;
import java.util.*;
import java.io.*;
public class Eight {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = br.readLine().split(" ");
		String l = input[0];
		String r = input[1];
		int ans =0;
		if(l.length()==r.length()) {
			boolean flag = false;
			for(int i = 0; i < l.length(); i++) {
				if(l.charAt(i)!=r.charAt(i)) {
					break;
				}else {
					if(l.charAt(i)=='8') ans++; 
				}
			}
		}
		System.out.print(ans);
	}
}
