package argo.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SeriesSort2 {
	static int n;
	static Num[] numArr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		numArr = new Num[n];
		String str = br.readLine();
		String[] token = str.split(" ");
		for(int i = 0; i <n; i++) {
			int num = Integer.parseInt(token[i]);
			numArr[i]= new Num(num, i);
		}
		Arrays.sort(numArr, new Comparator<Num>() {
			@Override
			public int compare(Num o1, Num o2) {
				if(o1.val < o2.val) {
					return -1;
				}else if(o1.val > o2.val){
					return 1;
				}else {
					if(o1.ind < o2.ind) {
						return -1;
					}else {
						return 1;
					}
				}
			}
		});
		for(int i =0; i <n ; i++) {
			bw.write(numArr[i].ind+" "); 
		}
		bw.flush();
	}
	static class Num{
		int val;
		int ind;
		public Num(int v, int i) {
			this.val = v;
			this.ind = i;
		}
	}
}
