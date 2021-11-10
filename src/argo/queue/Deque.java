package argo.queue;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class Deque {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static LinkedList<Integer> deq;
	public static void main(String[] args) throws NumberFormatException, IOException {
		deq = new LinkedList<>();
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n ; i++) {
			String[] arr = br.readLine().split(" ");
			switch(arr[0]) {
			case "push_front" : 
				deq.addFirst(Integer.parseInt(arr[1]));
				break;
			case "push_back":
				deq.addLast(Integer.parseInt(arr[1]));
				break;
			case "pop_front" :
				if(deq.isEmpty()) {
					bw.write("-1\n");
				}else {
					bw.write(deq.pollFirst()+"\n");
				}
				break;
			case "pop_back":
				if(deq.isEmpty()) {
					bw.write("-1\n");
				}else {
					bw.write(deq.pollLast()+"\n");
				}
				break;
			case "size":
				bw.write(deq.size()+"\n");
				break;
			case "empty":
				if(deq.isEmpty()) {
					bw.write(1+"\n");
				}else {
					bw.write(0+"\n");
				}
				break;
			case "front":
				if(deq.isEmpty()) {
					bw.write(-1+"\n");
				}else {
					bw.write(deq.peekFirst()+"\n");
				}
				break;
			case "back":
				if(deq.isEmpty()) {
					bw.write(-1+"\n");
				}else {
					bw.write(deq.peekLast()+"\n");
				}
				break;
			}
		}
		br.close();
		bw.flush();
	}
}
