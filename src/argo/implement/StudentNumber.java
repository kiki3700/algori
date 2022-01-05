package argo.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class StudentNumber {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int n =Integer.parseInt(br.readLine());
		String num = new String();
		String[] numArr = new String[n];
		for(int i = 0 ; i< n ; i++) {
			numArr[i] = br.readLine();
			
		}

		int len =numArr[0].length();
		for(int i=1; i <=len; i++) {
			Set<String> set = new HashSet<>();
			boolean flag = false;
			for(int j = 0; j < n ; j++) {
				String str = numArr[j].substring(len-i);
//				System.out.println(str);
				if(set.contains(str)) {
					flag = true;
					break;
				}else {
					set.add(str);
				}
			}
			if(!flag) {
				System.out.println(i);
				return;
			}
		}
	}
}
