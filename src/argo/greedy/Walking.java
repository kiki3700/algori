package argo.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Walking {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		long x,y,z,w;
		x= Integer.parseInt(st.nextToken());
		y= Integer.parseInt(st.nextToken());
		z= Integer.parseInt(st.nextToken());
		w= Integer.parseInt(st.nextToken());
		
		long diff = Math.abs(x-y);
		long  min = Math.min(x,y);
		long a = diff*z+min*w;
		long b = (x+y)*z;
		long c;
		if((x+y)%2==0) {
			c = Math.max(x, y)*w;
		}else {
			c = (Math.max(x, y)-1)*w+z;
		}
		System.out.println(Math.min(Math.min(a, b),c));
	}
}
