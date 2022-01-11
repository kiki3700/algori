package argo.HashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class DBJ {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n  = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		HashSet<String> dSet = new HashSet<>();
		List<String> list = new ArrayList<>();
		for(int i = 0 ; i < n ; i++) {
			dSet.add(br.readLine());
		}
		for(int i = 0 ; i <m; i++) {
			String tmp = br.readLine();
			if(dSet.contains(tmp)) {
				list.add(tmp);
			}
		}
		Collections.sort(list);
		sb.append(list.size()+"\n");
		for(int i = 0 ; i < list.size();i++) {
			sb.append(list.get(i)+"\n");
		}
		br.close();
		System.out.println(sb.toString());
	}
}
