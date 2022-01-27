package argo.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class CoordinateCompression {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		TreeMap<Integer,Integer> map = new TreeMap<>();
		for(int i = 0 ; i < n ;i++) {
			int tmp = Integer.parseInt(st.nextToken());
			arr[i] = tmp;
			
		}
		int[] sortArr = arr.clone();
		Arrays.sort(sortArr);
		int idx =0;
		for(int i = 0 ; i < n ; i++) {
			if(!map.containsKey(sortArr[i])) {
				map.put(sortArr[i], idx);
				idx++;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i <n ;i++) {
			sb.append(map.get(arr[i])+" ");
		}
		System.out.println(sb.toString());
	}
}
