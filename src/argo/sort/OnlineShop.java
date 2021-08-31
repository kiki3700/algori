package argo.sort;
import java.util.*;
public class OnlineShop {
	  static int n;
	    static int m;
	    static int[] arr;
	    static int price;
	    static int profit;
	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        n = sc.nextInt();
	        m = sc.nextInt();
	        arr = new int[m];
	        for(int i = 0; i < m; i++){
	            arr[i] = sc.nextInt();
	        }
	        Arrays.sort(arr);
	        profit = 0;
	        price =0;
	        for(int i = 0; i < m; i++){
	            int sum = 0;
	            int count = 0;
	            for(int j = i; j<m; j++){
	                if(arr[j]>= arr[i]) {
	                	count++;
	                }
	                if(count>n) {
	                	count=n;
	                }
	                sum = arr[i] * count;
	            }
	         
	            if(sum > profit){
	                profit = sum;
	                price = arr[i];
	            }

	        }
	        System.out.print(price+" "+profit);
	    }
	}