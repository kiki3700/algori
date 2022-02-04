package argo.diveAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Confetti {
	static int blue=0;
	static int white=0;
	static int[][] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int r = (int) Math.pow(2, n);
		arr =new int[n][n];
		for(int i = 0 ; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n ; j++) {
				arr[i][j]= Integer.parseInt(st.nextToken());
			}
		}
		diveAndConquer(0, 0, n);
		System.out.println(white);
		System.out.println(blue);
	}
	
	static boolean check(int x, int y, int size) {
		int val = arr[x][y];
		for(int i = x ; i < x+size; i++) {
			for(int j = y ; j<y+size;j++) {
				if(val != arr[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	static void diveAndConquer(int x, int y, int size) {
		int mid = size/2;

		if(check(x,y,size)) {
			if(arr[x][y]==1) blue++;
			else white++;
			return;
		}
		diveAndConquer(x,y,mid);
		diveAndConquer(x,y+mid,mid);
		diveAndConquer(x+mid,y,mid);
		diveAndConquer(x+mid,y+mid,mid);
	}
}
