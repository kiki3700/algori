package argo.HashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BestSeller {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		HashMap<String, Integer> map = new HashMap<>();
		for(int i = 0 ; i < n ; i++) {
			String tmp = br.readLine();
			map.put(tmp, map.getOrDefault(tmp, 0)+1);
		}
		int max = -1;
		String bestSeller = new String();
		for(String key : map.keySet()) {
			int tmp = map.get(key);
			if(max<tmp) {
				max = tmp;
				bestSeller = key;
			}else if(max == tmp && bestSeller.compareTo(key) > 0 ) {
				max = tmp;
				bestSeller = key;
			}
		}
		System.out.println(bestSeller);
	}
}
