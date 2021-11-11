package argo.math;
import java.util.*;
public class ACMHotel {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i = 0 ; i < n; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int idx = sc.nextInt();
			int yy = idx%h;
			int xx = idx/h;
			if(yy==0) {
				sb.append(h*100+xx+"\n");
			}else {
				sb.append(yy*100+xx+1+"\n");
			}
		}
		System.out.println(sb);
	}
}
