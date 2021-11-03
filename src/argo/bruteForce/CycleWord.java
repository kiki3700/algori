package argo.bruteForce;
import java.util.*;
public class CycleWord {
	static HashSet<String> map = new HashSet<>();
	static int cnt = 0;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0 ; i<n;i++) {
			search(sc.next());
		}
//		for(String key : map.keySet()) {
//			System.out.println(key);
//		}
//		System.out.println(cnt);
		System.out.print(map.size());
	}
	static void search(String str) {
		boolean flag =false;
		for(String key : map) {
			flag = anal(key, str);
			if(flag) {
				cnt++;
//				System.out.println(cnt+"th :"+key+" and "+str);
			}
		}
		if(!flag) {
			map.add(str);
		}
		
	}
	static boolean anal(String str1, String str2) {
		if(str1.length()!=str2.length()) return false;
		for(int i = 0 ; i<=str1.length()+4;i++) {
			if(str1.equals(str2)) return true;
			StringBuilder sb = new StringBuilder(str2);
			sb.append(sb.charAt(0)).deleteCharAt(0);
			str2= sb.toString();
			
		}
		return false;
	}
}
