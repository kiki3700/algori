package argo.heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeap {
	public static void main(String[] args) throws NumberFormatException, IOException {
		PriorityQueue<Integer> mh = new PriorityQueue<>(Collections.reverseOrder());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n ; i++) {
			int order = Integer.parseInt(br.readLine());
			if(order ==0) {
				if(mh.isEmpty()) {
					sb.append(0+"\n");
				}else {
					sb.append(mh.poll()+"\n");
				}
			}else {
				mh.add(order);
			}
		}
		br.close();
		System.out.print(sb.toString());
		
	}
}
