package argo.implement;
import java.util.*;
public class GroupWordChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		for(int i = 0 ; i < n;i++) {
			String str = sc.next();
			int len = str.length();
			HashMap<Character, Integer> map = new HashMap<>();
			for(int j = 0; j < len ; j++) {
				char c = str.charAt(j);
				int prior = map.getOrDefault(c, 100000);
				if(prior ==100000) map.put(c, j);
				else if(prior+1==j) map.put(c, j);
				else {
					cnt--;
					break;
				}
			}
		}
		System.out.print(n+cnt);
		
	}
}
