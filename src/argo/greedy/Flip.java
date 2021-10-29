package argo.greedy;
import java.util.*;
public class Flip {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char pre = ' ';
		int cnt = 0;
		for(int i = 0 ; i < str.length();i++) {
			if(pre != str.charAt(i)) {
			cnt++;
			}
			pre = str.charAt(i);
		}
		int ans = cnt/2;
		System.out.println(ans);
	}
}
