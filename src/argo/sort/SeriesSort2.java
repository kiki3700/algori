package argo.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class SeriesSort2 {
	static int n;
	static Num[] numArr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		numArr = new Num[n];
		String[] tokens= br.readLine().split(" ");
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(tokens[i]);
			numArr[i] = new Num(num, i);
		}
		seriesSorts(numArr);
		for(int i = 0 ; i < n; i++) {
			int val = numArr[i].ind;
			numArr[i].val = val;
			numArr[i].ind = i;
		}
		seriesSorts(numArr);
		for(int i = 0 ; i < n ; i++) {
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
	static void seriesSorts(Num[] numArr) {
		Arrays.sort(numArr, new Comparator<Num>() {
			@Override
			public int compare(Num o1, Num o2) {
				if(o1.val<o2.val) {
					return -1;
				}else if(o1.val>o2.val) {
					return 1;
				}else {
					if(o1.ind>o2.ind) {
						return 1;
					}else {
						return -1;
					}
				}
			}
		});
	}
}
