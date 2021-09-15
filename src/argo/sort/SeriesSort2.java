package argo.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SeriesSort2 {
	static int n;
	static Num[] numArr;
	static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String str1[] = br.readLine().split(" ");
		Num[] arr = new Num[n];
		for(int i = 0; i< n; i++) {
			arr[i] = new Num(Integer.parseInt(str1[i]),i);
		}
		int[] ind = new int[n];
		for(int i = 0 ; i <n; i++) {
			int min = arr[0].val;
			int minInd = 0;
			for(int j = 1; j< n; j++) {
				if(arr[minInd].val>arr[j].val) {
					if(arr[min].val>arr[j].val) {
						min = arr[j].val;
						minInd = j;
					}
				}
				ind[i]= minInd;
				arr[minInd].val = 212121;
			}
			
		}
		for(int i =0; i<n; i++) {
			for(int j = 0; j<n;j++) {
				if(arr[i].ind==ind[j]) bw.write(j+" ");
			}
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
