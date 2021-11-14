package argo.math;
import java.util.*;
public class Hive {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
        
        int idx = getIdx(n);
        
        System.out.println(idx);
        
        

        
    }
	static int getIdx(int n) {
		if(n==1) return 1;
		int idx = 2;
		int k =1;
		while(idx<=n) {
			idx += 6*k++;
		}
		return k;
	}
}