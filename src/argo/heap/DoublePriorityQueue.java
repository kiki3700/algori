package argo.heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class DoublePriorityQueue {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < n ;i++) {
			int order = Integer.parseInt(br.readLine());
			int count =0;
			TreeMap<Integer, Integer> map = new TreeMap<>();
			for(int j = 0 ; j < order ; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				char c = st.nextToken().charAt(0); 
				int num = Integer.parseInt(st.nextToken());
				if(c == 'I') {
					map.put(num, map.getOrDefault(num, 0)+1);
				}else {
					if(map.isEmpty()) continue;
					Entry<Integer, Integer> e;
					if(num>0) {
						e =map.pollLastEntry();
					}else {
						e = map.pollFirstEntry();
					}
					if(e.getValue()-1==0) continue;
					int lot = e.getValue()-1;
					map.put(e.getKey(), lot);
				}
			}
			if(!map.isEmpty()) {
				sb.append(map.lastKey()+" "+map.firstKey()+"\n");
				
			}else {
				sb.append("EMPTY\n");
				
			}
			
		}
		System.out.println(sb.toString());
	}
}
