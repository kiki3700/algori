package argo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class FourNumber {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		TreeSet<Integer> set = new TreeSet<>();
		set.add(a);
		set.add(b);
		set.add(c);
		int diff = Math.min(Math.abs(a-b), Math.abs(b-c));
		int first = set.first();
		int ans = -1 ;
		br.close();
		for(int i = 1 ; i < 4; i++) {
			int tmp = first + i*diff;			
			if(!set.contains(tmp)) {
				System.out.println(tmp);
				return;
			}
		}
	}
}
