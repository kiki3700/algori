package argo.queue;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class PrintQueue {
	static BufferedReader br;
	static BufferedWriter bw;
	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n ; i++) {
			
			Queue<Task> q = new LinkedList<>();
			StringTokenizer token = new StringTokenizer(br.readLine()," ");
			int len = Integer.parseInt(token.nextToken());
			ArrayList<Integer> arr = new ArrayList<>();
			int target = Integer.parseInt(token.nextToken());
			token = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < len; j++) {
				int pri = Integer.parseInt(token.nextToken());
//				System.out.print(pri);
				Task task = new Task(j, pri);
				q.add(task);
				arr.add(pri);
			}
			arr.sort(new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					// TODO Auto-generated method stub
					return o2-o1;
				}
			});			
			print(q, target, arr);			
		}
		br.close();
		bw.flush();
	}
	static void print(Queue<Task> q, int t, ArrayList<Integer> arr) throws IOException {
		int idx = 0;
		while(!q.isEmpty()) {
			Task task = q.poll();
			if(arr.get(0)>task.idx) {
				q.add(task);
			}else {
				idx++;
				if(t == task.num) {
					bw.write(idx+"\n");
					break;
				}else {
					arr.remove(0);
				}
			}
		
		}
	}
}

class Task{
	int num;
	int idx;
	public Task(int num, int idx) {
		this.num = num;
		this.idx = idx;
	}
	
}