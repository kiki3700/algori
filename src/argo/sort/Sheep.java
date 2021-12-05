package argo.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Sheep {
	static BufferedReader br;
	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> cList= new ArrayList<>();
		for(int i = 0 ; i< n ; i++) {
			cList.add(Integer.parseInt(st.nextToken()));
		}
		int k = Integer.parseInt(br.readLine());
		Integer[] bArr = new Integer[k];
		ArrayList<Integer> bList = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i <k ;i++) {
			bList.add(Integer.parseInt(st.nextToken())); 
		}
		br.close();
		Collections.sort(bList, Collections.reverseOrder());
		Collections.sort(cList, Collections.reverseOrder());
		int time = 0;
		if(bList.get(0)>cList.get(0)) {
			System.out.println(-1);
		
		}else {
			while(!bList.isEmpty()){
				int idx =0;
				for(int i = 0; i < n;) {
					if(idx == bList.size()) break;
					else if(bList.get(idx)<=cList.get(i)) {
						bList.remove(idx);
						i++;
					}else {
						idx++;
					}
				}
				time++;
			}
			System.out.println(time);
	}
	}
}
