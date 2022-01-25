package argo.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class MinMax {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		TreeSet<Integer> set = new TreeSet<>();
		StringTokenizer st= new StringTokenizer(br.readLine());
		for(int i = 0 ; i < n ; i++){
			set.add(Integer.parseInt(st.nextToken()));
		}
		System.out.println(set.first()+" "+set.last());
			
	}
}
