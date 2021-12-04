package argo.greedy;
import java.util.*;
public class WaterBottle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int ans= 0 ;
		while(true) {
			char[] binary = Integer.toBinaryString(n).toCharArray();
		
			int cnt = 0;
			for(int i = 0; i <binary.length;i++) {
			
				if(binary[i]=='1') cnt++;
			
			}
			
			if(cnt<= k) {
				System.out.println(ans);
				return;
			}
			n++;
			ans++;
		}
	}
}
