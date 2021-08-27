package argo.bruteForce;
import java.util.*;
public class GoodDuration {
    static int[] arr;
    static int n;
    static int l;
    static int f;
    static int b;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i]=sc.nextInt();
        }
        l = sc.nextInt();
        f= 1000000000;
        b = 0;
        Arrays.sort(arr);
        int count = 0;
        search();
        System.out.print(search2());
        
        
    }
    static void search(){
        int len = arr.length;
        
        for(int i = 0; i < len-1; i++){
        		if(arr[i]>l) {
        			f = Math.min(b, arr[i]);
        	}else if(arr[i]<l) {
        		b= Math.max(f, arr[i]);
        	}else {
        		break;
        	}
        }
    }
    static int search2() {
    	int count =0;
    	if(f!=b) {
    		for(int i = f+1; i<b-1; i++) {
    			for(int j= i+1; j<b; j++) {
    				if(i<=l&&l<=j) {
    					count++;

    				}
//    		int left = l -f-1;
//    		int right = b-l-1;
//    		count = left+right +(right*left);
//    			}
//    		

    	}
}
    	}
		return count;
    }
}