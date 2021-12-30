package argo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TestScore {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int miScore = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			miScore += Integer.parseInt(st.nextToken());
		}
		int maScore = 0;
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			maScore += Integer.parseInt(st.nextToken());
		}
		System.out.println(Math.max(miScore, maScore));
	}
}
