package argo.string;
import java.util.*;
public class StringReverse {
	public static String splitReverse(String str, int ind1, int ind2, int len) {
		StringBuilder sb = new StringBuilder();
		sb.append(reverse(str.substring(0, ind1+1)));
		sb.append(reverse(str.substring(ind1+1, ind2+1)));
		sb.append(reverse(str.substring(ind2+1, len+1)));
		return sb.toString();
	}
	public static String reverse(String str) {
		StringBuilder sb = new StringBuilder(str);
		String strRvs = sb.reverse().toString();
		return strRvs;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int len = str.length();
		String ans = splitReverse(str,0,1,len-1);
		for(int i = 0 ; i< len-2; i++) {
			for(int j = i+1 ; j <len-1; j++) {
				String tmp = splitReverse(str, i , j , len-1);
				if(ans.compareTo(tmp)>0) {
					ans = tmp;
				}
			}
		}
		System.out.print(ans);
	}
}
