package argo.greedy;
import java.util.*;
public class GuitarString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int set = 1000;
		int unit = 1000;
		for(int i = 0 ; i < m ; i++) {
			int tmpSet = sc.nextInt();
			int tmpUnit = sc.nextInt();
			set = Math.min(tmpSet, set);
			unit = Math.min(tmpUnit, unit);
		}
		int case1 = unit *n;
		int case2 = (n/6+1)*set;
		int case3 = (n/6)*set + (n%6)*unit;

		int mini = Math.min(case2, Math.min(case3, case1));

		System.out.print(mini);
	}
}
