package argo.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SeriesSort2 {
	static int n;
	static Num[] numArr;
	static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
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
