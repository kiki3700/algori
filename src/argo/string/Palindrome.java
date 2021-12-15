package argo.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeMap;

public class Palindrome {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		TreeMap<Character, Integer> map = new TreeMap<>();
		for(int i = 0 ;  i < arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		int odd = 0;
		int even = 0;
		char oddC=' ';
		for(Character c :map.keySet()) {
			int tmp = map.get(c);
			if(tmp%2==1) {
				odd++;
				oddC =c;
			}else {
				even++;
			}
		}
		if(arr.length%2==1) {
			if(odd!=1) {
				System.out.println("I'm Sorry Hansoo");
				return;
			}
		}else {
			if(odd != 0) {
				System.out.println("I'm Sorry Hansoo");
				return;
			}
		}
		StringBuilder pre = new StringBuilder();
		StringBuilder post = new StringBuilder();
		for(Character c : map.keySet()) {
			int len = map.get(c);
			if(len%2==1) len--;
			for(int i =0 ; i<len ; i= i+2) {
				pre.append(c);
				post.append(c);
			}
		}
		if(str.length()%2==1) System.out.println(pre.toString()+oddC+post.reverse());
		else System.out.println(pre.toString()+post.reverse());
	}
}
