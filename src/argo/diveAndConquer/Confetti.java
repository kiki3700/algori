package argo.diveAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Confetti {
	static int blue=0;
	static int white=0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int r = (int) Math.pow(2, n);
		int[][] arr =new int[n][n];
		for(int i = 0 ; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n ; j++) {
				arr[i][j]= Integer.parseInt(st.nextToken());
			}
		}
		diveAndConquer(arr);
		System.out.println(white);
		System.out.println(blue);
	}
	
	static int check(int[][] arr) {
		int r = arr.length;
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0 ; i < r; i++) {
			for(int j = 0 ; j<r;j++) {
				int tmp = arr[i][j];
				if(set.isEmpty()) set.add(tmp);
				else if(!set.contains(tmp)) {

					return -1;
				}
			}
		}
		if(set.contains(1)) return 1;
		else return 0;
	}
	static void diveAndConquer(int[][] arr) {
		int mid = arr.length/2;
		int r = arr.length;
		int result = check(arr);
		if(result!=-1) {
			if(result==1) blue++;
			else white++;
			return;
		}
		int[][] a1 = new int[mid][mid];
		int[][] a2= new int[mid][mid];
		int[][] a3= new int[mid][mid];
		int[][] a4 = new int[mid][mid];

		for(int i = 0 ; i < mid; i++) {
			for(int j = 0; j<mid; j++) {
				
				a1[i][j] = arr[i][j];
			}
		}
		for(int i = 0 ; i < mid; i++) {
			for(int j = 0; j<mid; j++) {
				a2[i][j] = arr[i][j+mid];
			}
		}
		for(int i = 0 ; i < mid; i++) {
			for(int j = 0; j<mid; j++) {
				a3[i][j] = arr[i+mid][j];
			}
		}
		for(int i = 0 ; i < mid; i++) {
			for(int j = 0; j<mid; j++) {
				a4[i][j] = arr[i+mid][j+mid];
			}
		}
		diveAndConquer(a1);
		diveAndConquer(a2);
		diveAndConquer(a3);
		diveAndConquer(a4);
	}
}
