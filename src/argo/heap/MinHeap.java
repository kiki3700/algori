package argo.heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class MinHeap {
	public static void main(String[] args) throws NumberFormatException, IOException {
		PriorityQueue<Integer> mh = new PriorityQueue<>();
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for(int i =0; i <n; i ++) {
			int input = Integer.parseInt(br.readLine());
			if(input ==0) {
				if(mh.isEmpty()) {
					sb.append(0+"\n");
				}else {
					int tmp = mh.poll();
					sb.append(tmp+"\n");
				}
			}else {
				mh.add(input);
			}
		}
		br.close();
		System.out.print(sb.toString());
	}
}
