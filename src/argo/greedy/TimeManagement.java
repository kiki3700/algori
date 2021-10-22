package argo.greedy;
import java.util.*;
public class TimeManagement {
	static int n;
	static Job[] arr;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new Job[n];
		for(int i = 0; i<n; i++) {
			int time = sc.nextInt();
			int limit = sc.nextInt();
			Job job = new Job(time, limit);
			arr[i] = job;
		}
		Arrays.sort(arr);
		
		int time = arr[n-1].limit-arr[n-1].time;
		for(int i = n-2; i>=0; i--) {
			if(arr[i].limit>time) {
				arr[i].limit=time;
			}
			time = arr[i].limit-arr[i].time;
		}
		if(time <0) System.out.print(-1);
		else System.out.print(time);
	}
}
class Job implements Comparable<Job>{
	int time;
	int limit;
	Job(int time, int limit){
		this.time = time;
		this.limit = limit;
	}
	
	@Override
	public int compareTo(Job o) {
		return this.limit<o.limit? -1:this.limit==o.limit?this.time<=o.time?-1:1:1;
	}
}

