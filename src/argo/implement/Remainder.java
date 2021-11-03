package argo.implement;
import java.util.*;
public class Remainder {
	static HashSet<Integer> set = new HashSet<>();
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		for(int i = 0; i<10; i++) {
			set.add(sc.nextInt()%42);
		}
		System.out.println(set.size());
	}
}
