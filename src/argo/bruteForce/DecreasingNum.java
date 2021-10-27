package argo.bruteForce;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class DecreasingNum {
	static ArrayList<Long> list = new ArrayList<>();
	static int[] num = {9,8,7,6,5,4,3,2,1,0};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		decrease(0,0);
		list.sort(null);
		if(n >1023) {
			System.out.print(-1);
		}else {
			System.out.print(list.get(n-1));
		}
	}
	static void decrease(long sum, int idx) {
		if(!list.contains(sum)) list.add(sum);
		if(idx >= 10) return;
		decrease(sum*10+num[idx],idx+1);
		decrease(sum, idx+1);
	}
}
