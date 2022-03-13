package argo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pet {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		float minWeight = 0;
		float maxWeight = 0;
		float weight = 0;
		boolean flag =false;
		int idx = 1;
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String firstToken = st.nextToken();
			if(firstToken.equals("#")) {
				if(flag) {
					sb.append(idx+" RIP\n");
				}else if(minWeight< weight && weight< maxWeight) {
					sb.append(idx+" :-)\n");
				}else if( weight <=0) {
					sb.append(idx+" RIP\n");
				}else {
					sb.append(idx+" :-(\n");
				}
				idx++;
			}else if(firstToken.equals("F")) {
				float n = Float.parseFloat(st.nextToken());
				weight += n;
			}else if(firstToken.equals("E")) {
				float n = Float.parseFloat(st.nextToken());
				weight -= n;
			}else if(firstToken.equals("0")){
				System.out.println(sb.toString());
				return;
			}else {
				weight = Integer.parseInt(st.nextToken());
				float goodWeight = Integer.parseInt(firstToken);
				minWeight = goodWeight/2;
				maxWeight = 2*goodWeight;
				flag = false;
			}
			if(weight <= 0) {
				flag=true;
			}
		}
	}
}
