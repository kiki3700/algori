package argo.implement;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Shortcut {
	static HashSet<Character> set = new HashSet<>();
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		
		Scanner sc =new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine()); 
		
		for(int i = 0 ; i < n ; i ++) {
			String str=sc.nextLine();
			String[] strArr = str.split(" ");
			char[] charArr = str.toCharArray();
			
			
		}
		
			
		}
		static boolean test(String[] strArr) {
			for(int i =0; i <strArr.length;i++) {
				char f = Character.toUpperCase(strArr[i].charAt(0));
				if(set.contains(f)) {
					set.add(f);
					for(int i = 0 ; i)
				}
			}
		
			return false;
		}	
		
	}
