package argo.hashing;
import java.io.*;
public class Hashing {
	static BufferedReader br;
	static BufferedWriter bw;
	static int base = 96;
	static long r= 31;
	static long m = 1234567891;
	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		long val = hashing(str);
		br.close();
		System.out.print(val);
	}
	static long hashing(String str){
		
		long sum = 0;
		long pow = 1;
		for(int i = 0 ; i <str.length();i++) {
			int tmp = str.charAt(i)-base;
			sum += tmp*pow;
			pow = (pow*=r)%m;
		}
		return sum%m;
	}
}
