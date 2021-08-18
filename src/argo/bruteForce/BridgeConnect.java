package argo.bruteForce;
import java.util.*;
public class BridgeConnect {
	static int cnt =0;
	static int x;

	static StringBuilder sb;
	public static void main(String[] args) {
		sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		x= sc.nextInt();
		for(int i =0; i<x;i++) {
			int n = sc.nextInt();
			int m= sc.nextInt();
//			System.out.println("n"+n+"m"+m);
			for(int j = 1; j<=n;j++) {
				search(1, j, n, m);
			}
			sb.append(cnt+"\n");
			cnt = 0;
		}
		System.out.print(sb);
		
	}
	static void search(int index, int from,int n, int m) {
//		System.out.print("ehfdk?"+index);
		if(from >= m) return;
		if(index>n){ cnt++; return;}

		for(int i = (from);i <= m ; i++) {
//			System.out.println("index : "+index+" from : "+from+" to : "+i);
			search(index+1, i, n, m);
			
		}
	}
}
