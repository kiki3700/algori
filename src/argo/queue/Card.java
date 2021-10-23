package argo.queue;
import java.util.*;
public class Card {
	static Queue<Integer> q;
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		q = new LinkedList<>();
		for(int i = 1; i <= n; i++) {
			q.offer(i);
		}
		System.out.print(play());
	}
	static int play() {
		while(n!=1) {
			q.poll();
			q.offer(q.poll());
			n--;
		}
			
		return q.poll();
	}
}
