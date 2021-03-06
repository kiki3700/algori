package argo.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class NumberCard {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0 ; i < n ; i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		int k = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ;  i < k ; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			if(set.contains(tmp)) sb.append(1+" ");
			else sb.append(0+" ");
		}
		System.out.println(sb.toString());
	}
}
