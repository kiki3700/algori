package argo.diveAndConquer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Confetti2 {
	
	static int a = 0;
	static int b = 0;
	static int c = 0;
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];
		for(int i = 0 ; i < n ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		br.close();
		diveAndConquer(arr);
		bw.append(a+"\n");
		bw.append(b+"\n");
		bw.append(c+"\n");
		bw.flush();
		bw.close();
	}
	static void diveAndConquer(int[][] arr) {
		int con = 100;
		if((con =check(arr))!=100) {
			if(con == -1) a++; 
			if(con == 0) b++;
			if(con == 1) c++;
			return;
		}
		int len = arr.length;
		int m1 = len/3;
		int m2 = len/3*2;
		
		int[][] arr1 = new int[m1][m1];
		int[][] arr2 = new int[m1][m1];
		int[][] arr3 = new int[m1][m1];
		int[][] arr4 = new int[m1][m1];
		int[][] arr5 = new int[m1][m1];
		int[][] arr6 = new int[m1][m1];
		int[][] arr7 = new int[m1][m1];
		int[][] arr8 = new int[m1][m1];
		int[][] arr9 = new int[m1][m1];
		
		for(int i = 0; i <m1 ; i++) {
			for(int j = 0 ; j < m1; j++) {
				arr1[i][j] = arr[i][j];
			}
		}
		for(int i = 0; i <m1 ; i++) {
			for(int j = 0 ; j < m1; j++) {
				arr2[i][j] = arr[i][j+m1];
			}
		}
		for(int i = 0; i <m1 ; i++) {
			for(int j = 0 ; j < m1; j++) {
				arr3[i][j] = arr[i][j+m2];
			}
		}
		for(int i = 0; i <m1 ; i++) {
			for(int j = 0 ; j < m1; j++) {
				arr4[i][j] = arr[i+m1][j];
			}
		}
		for(int i = 0; i <m1 ; i++) {
			for(int j = 0 ; j < m1; j++) {
				arr5[i][j] = arr[i+m1][j+m1];
			}
		}
		for(int i = 0; i <m1 ; i++) {
			for(int j = 0 ; j < m1; j++) {
				arr6[i][j] = arr[i+m1][j+m2];
			}
		}
		for(int i = 0; i <m1 ; i++) {
			for(int j = 0 ; j < m1; j++) {
				arr7[i][j] = arr[i+m2][j];
			}
		}
		for(int i = 0; i <m1 ; i++) {
			for(int j = 0 ; j < m1; j++) {
				arr8[i][j] = arr[i+m2][j+m1];
			}
		}
		for(int i = 0; i <m1 ; i++) {
			for(int j = 0 ; j < m1; j++) {
				arr9[i][j] = arr[i+m2][j+m2];
			}
		}
		diveAndConquer(arr1);
		diveAndConquer(arr2);
		diveAndConquer(arr3);
		diveAndConquer(arr4);
		diveAndConquer(arr5);
		diveAndConquer(arr6);
		diveAndConquer(arr7);
		diveAndConquer(arr8);
		diveAndConquer(arr9);
	}
	static int check(int[][] arr) {
		int l = arr.length;
		int content = arr[0][0];
		for(int i = 0 ; i < l ; i++) {
			for(int j = 0 ; j < l;j++) {
				if(content!= arr[i][j]) return 100;
			}
		}
		return content;
	}
}
