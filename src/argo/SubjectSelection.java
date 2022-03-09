package argo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubjectSelection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int min = 101;
		int minIdx = -1;
		for(int i = 0 ; i < 4; i++) {
			int tmp = sc.nextInt();
			if(min>tmp) {
				min = tmp;
				minIdx = i;
			}
			list.add(tmp);
		}
		list.remove(minIdx);
		int e = sc.nextInt();
		int f = sc.nextInt();
		int max = Math.max(e, f);
		int sum = 0;
		for(Integer n : list) {
			sum+=n;
		}
		sum +=max;
		System.out.println(sum);
	}
}
