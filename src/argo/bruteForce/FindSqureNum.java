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
		int max = -1;
		
				for(int i = 0 ;i>-1&& i < rn;i++) {
					for(int j = 0; j>-1&&j<cn; j++) {
						for(int a= -rn ; a <rn; a++) {
							for(int b = -cn ; b<cn;b++) {
								if(a==0 && b==0) continue;
								String str = "";
								int x = i;
								int y = j;
								while(x>=0&&x<rn && y>=0&&y<cn) {
									str += arr[i][j];
									int tmp = Integer.parseInt(str);
									if(checkcSquar(tmp)) {
									 max =	Math.max(max, tmp);
									}
									x+=a;
									y+=b;
								}
								
					}
				}
						
			}
		}
	System.out.println(max);
	}
	
	static boolean checkcSquar(int n) {
		if((n%10)%2==1) return false;
		int sqt = (int) Math.sqrt(n);
		if(Math.pow(sqt, 2)==n) return true;
		else return false;
	}
}
