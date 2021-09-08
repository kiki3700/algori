package argo.binarySearch;
import java.util.*;
public class Game {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = getPercen(x,y);
		
		int ans = -1;
		int left = 0;
		int right = (int) 1e9;
		while(left <= right) {
			int mid = (left + right)/2;
			if(getPercen(x+mid, y + mid)!=z) {
				ans = mid ;
				right = mid -1;
			}else {
				left = mid+1;
			}
		}
		System.out.print(ans);
	}
	static public int getPercen(int x , int y) {
		return (int)( (long)y *100/x);
	}
}
