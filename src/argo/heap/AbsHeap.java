package argo.heap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class AbsHeap {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();
		
		int n = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < n ; i++) {
			int order = Integer.parseInt(br.readLine());
			if(order == 0 ) {
				if(pq.isEmpty()) {
					bw.append(0+"\n");
					continue;
				}else {
					int key =pq.poll();
					PriorityQueue<Integer> heap = map.get(key);
					int value = heap.poll();
					map.put(key, heap);
					bw.append(value+"\n");
					continue;
					
				}
			}else {
				int key = Math.abs(order);
				pq.add(key);
				PriorityQueue<Integer> heap = map.getOrDefault(key, new PriorityQueue<Integer>());
				heap.add(order);
				map.put(key, heap);
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
