package argo.bitmask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BinarySum {
	static BufferedReader br;
	public static void main(String[] args) throws IOException {
		br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String a = st.nextToken();
		String b = st.nextToken();
		if(a.length()<b.length()) {
			String tmp = a;
			a= b;
			b = tmp;
		}
		int diff = a.length()-b.length();
		StringBuilder sb = new StringBuilder();
		while(diff-->0) {
			sb.append("0");
		}
		b=sb.toString()+b;
		
		char[] aArr = a.toCharArray();
		char[] bArr =b.toCharArray();
		
		int h = 0;
		sb = new StringBuilder();
		for(int i = aArr.length-1; i >=0; i--) {
			
			int sum = (aArr[i]-'0')+(bArr[i]-'0')+h;
			if(sum ==3) {
				sb.append(1);
				h=1;
			}else if( sum == 2) {
				sb.append(0);
				h=1;
			}else if(sum == 1) {
				sb.append(1);
				h=0;
			}else {

				sb.append(0);
				h=0;
			}
		}
		
		if(h==1) { sb.append(1);}
		String s = sb.reverse().toString();
        String ans = "";
        boolean one = true;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '1')
                one = false;
            if(one) continue;
            ans += s.charAt(i);
        }
        System.out.println(ans.equals("") ? 0 : ans);
	}
}
