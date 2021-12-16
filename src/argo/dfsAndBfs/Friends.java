package argo.dfsAndBfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Friends {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			boolean[][] arr;
			boolean[][] mark;
			int[] result;
			int n;
		n = Integer.parseInt(br.readLine());
		arr = new boolean[n][n];
		mark = new boolean[n][n];
		result = new int[n];
		String tmp; 
		for(int i = 0; i < n; i++) {
			tmp = br.readLine();
			for(int j = 0 ; j<n; j++) {
				char a = tmp.charAt(j);
				if(a == 'Y') arr[i][j] = true;
			}
		}

		for(int i = 0 ; i <n ; i++) {
			for(int  j = 0; j <n; j++) {
				if(arr[i][j]) {
					if(!mark[i][j]) {
						result[i]++;
						mark[i][j] = true;
					}
					for(int k = 0 ; k <n ; k++) {
						if(arr[j][k]&&!mark[i][k]&&k!=i) {
							result[i]++;
							mark[i][k]=true;
						}
					}
				}
			}
		}
		Arrays.sort(result);
		bw.write(String.valueOf(result[n-1]));
		bw.flush();
	}
}
