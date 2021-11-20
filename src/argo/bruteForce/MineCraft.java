package argo.bruteForce;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.TreeMap;
public class MineCraft {
	static BufferedReader br;
	static BufferedWriter bw;
	static double inv;
	static int n;
	static int m;
	static int sum;
	static int[][] arr;
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		 m = Integer.parseInt(st.nextToken());
		inv = Double.parseDouble(st.nextToken());
		int answerTime = 2147000000;
		int answerheight = -1;
		TreeMap<Integer, Integer> map = new TreeMap<>();
		arr =new int[n][m];
		int max =-1;
		int min = Integer.MAX_VALUE;
		double sum = 0;
		for(int i =0; i<n;i++ ) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				int tmp =Integer.parseInt(st.nextToken());
				arr[i][j]= tmp;
				sum+=tmp;
				max = Math.max(tmp, max);
				min = Math.min(tmp, min);
			}
		}
		sum+= inv;
		
		
		for(int t = 0; t<=255; t++) {
			if(t*n*m>sum) continue;
			Integer time = 0;
			for(int i = 0; i <n; i++) {
				for(int j =0; j<m;j++) {
					int cur = arr[i][j];
					if(cur > t) {
						time += pop(t, cur);
						
					}else if(cur<t){
						time += put(t, cur);
					}
//			
				}
			}
			if(time < answerTime) {
				answerTime = time;
				answerheight = t;
			}
			map.put(time, t);
		}
		br.close();
		Entry<Integer,Integer> ent=map.pollFirstEntry();
//		System.out.print((long) ent.getKey()+" "+ent.getValue());
		System.out.println(answerTime +" "+ answerheight);
		
	}
	static int pop(int target, int cur) {
		
		return (cur-target)*2;
	}
	static int put(int target, int cur) {

		return target-cur; 
	}
	
}
