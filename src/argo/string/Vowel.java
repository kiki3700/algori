package argo.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vowel {
	static char[] vowels = {'a','e','i','o','u', 'A','I','O','E','U'};
	static boolean checkVowel(char c) {
		for(int i = 0 ; i <vowels.length; i++) {
			if(c==vowels[i]) return true;
		}
		return false;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			String str = br.readLine();
			if(str.equals("#")) break;
			int cnt = 0;
			for(int i = 0 ; i < str.length();i++) {
				char c = str.charAt(i);
				if(checkVowel(c)) cnt++;
			}
			sb.append(cnt+"\n");
		}
		System.out.println(sb.toString());
	}
	
}
