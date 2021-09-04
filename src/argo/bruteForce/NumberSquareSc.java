package argo.bruteForce;
import java.io.*;
import java.util.*;
public class NumberSquareSc {
    static int n;
    static int m;
    static int[][] arr;
    static int max = 0;
    static int ans =1;
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	n = sc.nextInt();
    	m = sc.nextInt();
    	arr =new int[n][m];
    	for(int i =0 ; i<n;i++) {
    		String str = sc.next();
    		for(int j = 0; j < m;j++) {
    			arr[i][j]=str.charAt(j)-'0';

    		}
    	}  
    	for(int i =0 ; i<n-1;i++) {
    		for(int j = 0; j < m-1;j++) {

    			search(j,i);
    		}
    	} 
    	System.out.print(ans);
    }
    static void search(int x, int y) {
    	//cal boundary
    	int bound = Math.min(m-x, n-y);
    	int sum = 0;
    	for(int i = 1; i < bound; i ++) {
    		int a1 = arr[y][x];
    		int a2 = arr[y+i][x];
    		int a3 = arr[y][x+i];
    		int a4 = arr[y+i][x+i];
    		sum = i+1;
    		if(a1==a2&&a1==a3&&a1==a4&&sum>max) {
    			max= sum;
    			ans = sum*sum; 
      			
    		}
    	}
    }
}