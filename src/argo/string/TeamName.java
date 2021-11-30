package argo.string;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;
public class TeamName {
	static BufferedReader br;
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		int n = Integer.parseInt(br.readLine());
		TreeMap<String,Double> map = new TreeMap<>();
		for(int i  = 0 ; i < n ; i++) {
			String tmp = br.readLine();
			map.put( tmp,getProb(name, tmp));
		}
		double max = -1;
		String ans = new String();
		for(String key : map.keySet()) {
			double tmp = map.get(key);
			if(tmp >max) {
				ans = key;
				max = tmp;
			}
			
		}
		System.out.println(ans);
	}
	static double getProb(String a, String b) {
		int ln = getCharNum(a, b, 'L');
		int on = getCharNum(a, b, 'O');
		int vn = getCharNum(a, b, 'V');
		int en = getCharNum(a, b, 'E');
		return ((double)(ln+on)*(ln+vn)*(ln+en)*(on+vn)*(on+en)*(vn+en))%100;
	}
	static int getCharNum(String a , String b, char c) {
		int cnt = 0;
		for(int i = 0; i < a.length(); i++) {
			if(c == a.charAt(i)) cnt++; 
		}
		for(int i = 0 ; i < b.length();i++) {
			if(c == b.charAt(i)) cnt++;
		}
		return cnt;
	}
}
