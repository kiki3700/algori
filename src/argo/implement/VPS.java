package argo.implement;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Stack;
public class VPS {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i<n ;i++) {
			String str = br.readLine();
			boolean flag = true;
			Stack<Character> s = new Stack<>();
			for(int j = 0 ; j < str.length();j++) {
				if(str.charAt(j)=='(') {
					s.add('(');
				}else {
					if(s.isEmpty()) {
						flag= false;
					}else {
						s.pop();
					}
				}
			}
				if(s.size()>0 || !flag) {
					bw.write("NO\n");
				}else {
					bw.write("YES\n");
				}
			}
			
		
		br.close();
		bw.flush();
	}
}
