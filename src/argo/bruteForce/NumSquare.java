package argo.bruteForce;
import java.io.*;
import java.util.*;
public class NumSquare {

    static int n;
    static int m;
    static int[][] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] tmp = br.readLine().split(" ");
        n = Integer.parseInt(tmp[0]);
        m = Integer.parseInt(tmp[1]);
        arr = new int[n][m];
        for(int i = 0; i < n; i++) {
        	String line =br.readLine();
        	for(int j = 0; j <m ; j++) {
        		arr[i][j]= Integer.parseInt(line.charAt(j));

        	}
        }
        

        
    }
}