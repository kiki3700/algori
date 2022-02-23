package argo.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class RightArray {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> list =new ArrayList<>();
		for(int i = 0 ; i < n;i++) {
			int tmp = Integer.parseInt(br.readLine());
			list.add(tmp);
		}
		list.sort(Comparator.naturalOrder());
		int max = 0;
		int cnt = 0;
		int end = n<5? 1: n;
		for(int i = 0 ; i < end; i++) {
			int base = list.get(i)+4;
			for(int j = 0 ; j < n-i;j++) {
				int compareNum = list.get(i+j);
				if(base>=compareNum) {
					cnt++;
				}else {
					break;
				}
			}
			if(cnt>max) max = cnt;
			cnt=0;
		}
		System.out.println(5-max);
	}
	
}
