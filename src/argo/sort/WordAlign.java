package argo.sort;

import java.util.*;

public class WordAlign {
	static HashSet<String> set;
	static int n;
	static StringBuilder sb;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sb = new StringBuilder();
		set = new HashSet<>();
		for(int i = 0; i<n; i++) {
			set.add(sc.next());
		}
		String[] arr = new String[set.size()];
		int i = 0;
		for(String str : set) {
			arr[i]= str;
			i++;
		}
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String v1, String v2) {
				if(v1.length()>v2.length()) {
					return 1;
				}else if(v1.length()<v2.length()) {
					return -1;
				}
				return v1.compareTo(v2);
			}
		});
		for(int j = 0; j <i; j++) {
			sb.append(arr[j]+"\n");
		}
		System.out.print(sb);
	}
}