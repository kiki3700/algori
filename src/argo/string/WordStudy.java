package argo.string;
import java.util.*;
public class WordStudy {
	static String str;
	static int len;
	static HashMap<Character, Integer> map;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		str= str.toLowerCase();
		len = str.length();
		map = new HashMap<>();
		for(int i =0; i<len; i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
		}
		int max =0;
		boolean flag = false;
		String maxChar = null;
		for(char key: map.keySet()) {
			int tmp =map.get(key);
			if (max<tmp) {
				 maxChar= key+"";
				max=tmp;
				flag=false;
			}else if(max==tmp) {
				flag=true;
			}
		}
		if(flag) {
			System.out.print("?");
		}else {
			System.out.print(maxChar.toUpperCase());
		}
	}
}
