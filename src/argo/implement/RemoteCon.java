package argo.implement;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
public class RemoteCon {
	static BufferedReader br;
	static List<Integer> numList = new ArrayList<>();
	static int min;
	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		
		int target = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		if(n !=0)  st = new StringTokenizer(br.readLine());
		br.close();

		Set<Integer> withOutSet = new HashSet<>();
		
			for(int i = 0 ; i< n; i++) {
				int tmp = Integer.parseInt(st.nextToken());
				withOutSet.add(tmp);
			}
		
		
		
		for(int i = 0 ; i <10; i++) {
			if(!withOutSet.contains(i)) numList.add(i);
		}
		
		min = Math.abs(target-100);
		int len =1;
		if(target!=0) len = (int) (Math.log10(target)+1);
		if(numList.size()!=0) getCloseNum(target,0, len);
		System.out.print(min);
	}
	static void getCloseNum(int target,int idx,int d, int len) {
		if(len+2 < idx) {
		
			return;
		}
		for(int a : numList) {
			int numLen=0;
			if(d ==0) numLen= 1;
			else numLen =(int) Math.log10(d)+1;
			min = Math.min(min, Math.abs(target- d)+numLen);
			getCloseNum(target, idx+1,( d+a*(int)Math.pow(10, idx)),len);
		}
	}
	static void getCloseNum(int target,int idx, int len) {
		if(len+1 < idx) {
		
			return;
		}
		for(int a : numList) {
			getCloseNum(target, idx+1,(a*(int)Math.pow(10, idx)),len);
		}
	}
}
