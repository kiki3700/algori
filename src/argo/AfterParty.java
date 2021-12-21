package argo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class AfterParty {
	static BufferedReader br;
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		BigInteger n  =new BigInteger(st.nextToken());
		BigInteger p = new BigInteger(st.nextToken());
		BigInteger expect = p.multiply(n);
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			BigInteger tmp = new BigInteger(st.nextToken());
			sb.append(tmp.subtract(expect).toString()+" ");
		}
		System.out.println(sb.toString());
	}
}
