package argo.diveAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuadTree {
	static int[][] img;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		img = new int[n][n];
		for(int i = 0 ; i <n ; i++) {
			String str = br.readLine();
			for(int  j = 0 ; j < n ; j++) {
				img[i][j] = str.charAt(j)-'0';
			}
		}
		quadTree(0, 0, n);
		System.out.println(sb.toString());
	}
	static void quadTree(int x, int y, int size) {
		if(check(x,y,size)) {
			sb.append(img[x][y]);
			return;
		}
		int newSize = size/2;
		sb.append("(");
		quadTree(x,y,newSize);
		quadTree(x,y+newSize,newSize);
		quadTree(x+newSize,y,newSize);
		quadTree(x+newSize,y+newSize,newSize);
		sb.append(")");
	}
	static boolean check(int x, int y, int size) {
		int value = img[x][y];
		for(int i = x; i< x+size; i ++) {
			for(int j = y; j <y+size; j++) {
				if(value!=img[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
