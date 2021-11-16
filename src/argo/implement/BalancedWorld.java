package argo.implement;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
public class BalancedWorld {
	static BufferedReader br;
	static BufferedWriter bw;
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = new String();
		while(!(str=br.readLine()).equals(".")) {
			checkBalance(str);
		}
		br.close();
		bw.flush();
	}
	static void checkBalance(String str) throws IOException {
		Stack<Character> ss = new Stack<>();
		for(int i = 0; i<str.length();i++) {
			char tmp = str.charAt(i);
			if(tmp=='('||tmp=='[') {
				ss.add(tmp);
			}else if(tmp==')'||tmp==']') {
				if(ss.isEmpty()) {
					bw.write("no\n");
					return;
				}else {
					char tmp2 = ss.pop();
					if(tmp2=='(') {
						tmp2=')';
					}else if (tmp2=='[') {
						tmp2=']';
					}
					if(tmp!=tmp2) {
						
						bw.write("no\n");
						return;
					}
				}
			}
		}
		if(ss.isEmpty()) {
			bw.write("yes\n");
			return;
		}else {
			bw.write("no\n");
		}
	}


}
