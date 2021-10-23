package argo.math;
import java.util.*;
import java.math.*;
public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while(true) {
			int[] arr = new int[3];
			for(int i = 0 ; i < 3; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			if(arr[1]==0) break;
			if(Math.pow(arr[2], 2)==Math.pow(arr[1], 2)+Math.pow(arr[0], 2)) {
				sb.append("right\n");
			}else {
				sb.append("wrong\n");
			}
			
		}
		System.out.print(sb);
	}
}
