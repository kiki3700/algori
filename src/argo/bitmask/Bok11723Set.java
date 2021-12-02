package argo.bitmask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bok11723Set {
	static BufferedReader br;
	static BufferedWriter bw;
	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int bitSet =0 ;
		for(int i = 0 ; i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String order = st.nextToken();
			int num = 0;
			switch(order) {
				case "add":
					num = Integer.parseInt(st.nextToken());
					bitSet |= (1 << (num-1));
					break;
				case "remove":
					num = Integer.parseInt(st.nextToken());
					bitSet = bitSet & ~(1<<num-1);
					break;
				case "check":
					num = Integer.parseInt(st.nextToken());
					bw.write((bitSet &(1<<(num-1))) != 0 ? "1\n" : "0\n");
					break;
				case "toggle":
					num = Integer.parseInt(st.nextToken());
					bitSet ^= (1<<(num-1));
					break;
				case "all" :
					bitSet |= (~0);
					break;
				case "empty" :
					bitSet &= 0;
					break;				
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
