package argo.HashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class SummetricDifference {
	static BufferedReader br;
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		HashSet<Integer> xSet = new HashSet<>();
		HashSet<Integer> ySet = new HashSet<>();
		st = new StringTokenizer(br.readLine());
		for(int i = 0;i<x; i++) {
			xSet.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0;i<y; i++) {
			ySet.add(Integer.parseInt(st.nextToken()));
		}
		xSet.retainAll(ySet);
		System.out.println(x+y-2*xSet.size());
	}
}
