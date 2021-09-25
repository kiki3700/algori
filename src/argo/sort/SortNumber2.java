package argo.sort;
import java.util.*;
public class SortNumber2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> arrList = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<n; i++) {
			arrList.add(sc.nextInt());
		}
		Collections.sort(arrList);
		for(int i = 0; i<n; i++) {
			sb.append(arrList.get(i)+"\n");
		}
		System.out.print(sb);
	}
}
