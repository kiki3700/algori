package argo.bruteForce;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;
public class FindSqureNum {
	static BufferedReader br;
	static BufferedWriter bw;
	static int[][] arr;
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int rn = sc.nextInt();
		int cn = sc.nextInt();
		sc.nextLine();
		arr = new int[rn][cn];
		for(int i = 0 ; i <rn; i++) {
			String str = sc.nextLine();
			for(int j = 0; j<cn; j++) {
				arr[i][j]= Integer.parseInt(str.charAt(j)+"");
			}
		}
		for(int i = 0 ; i < rn;i++) {
			for(int j = 0; j<cn; j++) {
				
			}
		}
		
	}
	
	static boolean checkcSquar(int n) {
		if((n%10)%2==1) return false;
		int sqt = (int) Math.sqrt(n);
		if(Math.pow(sqt, 2)==n) return true;
		else return false;
	}
}
