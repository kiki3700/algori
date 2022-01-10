package argo.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Meetingroom {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		
		for(int i =0; i <n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			arr[i][0] = from;
			arr[i][1] = to;
		}
		Arrays.sort(arr, new Comparator<int[]>(){
			@Override
			public int compare(int[] a1, int[] a2) {
				if(a1[1]==a2[1]) {
					return a1[0]-a2[0];
				}
				return a1[1]-a2[1];
			}
		});
		int end =0;
		int count =0;
		for(int i = 0 ; i < n ; i++) {
			if(end <=  arr[i][0]) {
				end = arr[i][1];
				count ++;
			}
		}
		System.out.println(count);
		
	}
}
