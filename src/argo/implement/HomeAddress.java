package argo.implement;
import java.util.*;
public class HomeAddress {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String a = new String();
		while(!(a = sc.next()).equals("0")) {
			int len = a.length();
			int sum = 0;
			for(int i = 0; i<len; i++) {
				if(a.charAt(i)=='0') {
					sum+= 4;
				}else if(a.charAt(i)=='1') {
					sum+= 2;
				}else {
					sum +=3;
				}
				sum+=1;
			}
			sum+=1;
			sb.append(sum+"\n");
		}
		System.out.print(sb);
	}
}
