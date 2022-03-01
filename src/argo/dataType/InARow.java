package argo.dataType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class InARow {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> list =new LinkedList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < n ; i++) {
			int order = Integer.parseInt(st.nextToken());
			int num = i +1;
			if(0 == order) {
				list.add(num);
			}else{
				list.add(list.size()-order, num);
			}
		}
		StringBuilder sb= new StringBuilder();
		for(Integer i : list) {
			sb.append(i+" ");
		}
		System.out.println(sb.toString());
		
	}
	
}
