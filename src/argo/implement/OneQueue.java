package argo.implement;
import java.util.*;
public class OneQueue {
		static int n,cnt;
		static int[] arr;
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			arr=new int[n];
			for (int i = 1; i <=n; i++) {
				cnt=sc.nextInt();// 나보다 큰 사람수
				for (int j = 0; j < n; j++) {
					if(cnt==0 && arr[j]==0) {//cnt가 0이지만 arr[j]가 0이 아니면 나보다 작은사람인 거다.
						arr[j]=i;
						break;
					}else if(arr[j]==0) {//나보다 큰 사람이 들어가는 위치라면
						cnt--;//나보다 큰 사람 수를 줄여준다.
					}
				}
				
			}
			
			for (int i = 0; i < n; i++) {
				System.out.print(arr[i]+" ");
			}
		}
	}
