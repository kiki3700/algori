package argo.greedy;

import java.util.Arrays;
import java.util.Scanner;
public class Matrix {
	static int n;
	static int m;
	static int[][] arr1;
	static int[][] arr2;
	static int[][] d = {{0,0}, {0,1}, {0,2},{1,0}, {1,1}, {1,2},{2,0}, {2,1}, {2,2}};
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
//		System.out.println("row: "+n+" col:"+m);
		arr1 = new int[n][m];
		arr2 = new int[n][m];
		int count = 0;
		
		for(int i = 0 ; i < n; i++) {
			String str = sc.next();
			for(int j = 0; j <m; j++) {
				arr1[i][j] = Integer.parseInt(str.charAt(j)+"");
			}
		}
		for(int i = 0 ; i < n; i++) {
			String str = sc.next();
			for(int j = 0; j <m; j++) {
				arr2[i][j] = Integer.parseInt(str.charAt(j)+"");
			}
		}
		
		
//		System.out.println("insert2");
		for(int i = 0 ; i<n; i++) {
			for(int j = 0; j<m; j++) {
				if(arr2[i][j]!=arr1[i][j]) {
					flip(i,j);
					count++;
					
				}
			}
		}
		
		
		
		if(Arrays.deepEquals(arr1, arr2)) {
			System.out.print(count);
		}else {
			System.out.print(-1);
		}
	}
	
	static void flip(int r, int c) {
		if(n<3 | m<3) return;
		if((r>=0& n-3>=r)&(c>=0& m-3>=c)) {
			for(int i = 0 ; i<9; i++) {
				int dr = r+ d[i][0];
				int dc = c+ d[i][1];
				if(arr1[dr][dc]==0) arr1[dr][dc] = 1;
				else arr1[dr][dc] = 0;
			}
		}
	}
}