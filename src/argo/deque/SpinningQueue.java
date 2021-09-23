package argo.deque;
import java.util.*;

public class SpinningQueue {

	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		LinkedList<Integer> deq = new LinkedList<>();
		for(int i =1; i <=n ; i++) deq.add(i);
		int count = 0;
		for(int i = 0; i< m; i++) {
			int target = sc.nextInt();
			int index = deq.indexOf(target);
			int halfIndex = deq.size()/2;
			if(index<=halfIndex) {
				while(target != deq.getFirst()) {
					deq.add(deq.pollFirst());
					count++;
				}
			}else {
				while(target != deq.getFirst()) {
					deq.addFirst(deq.pollLast());
					count++;
				}
			}
			deq.pollFirst();
		}
		System.out.print(count);
	}
}
