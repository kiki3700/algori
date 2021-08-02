package argo.binarySearch;
import java.util.*;

public class Budget {
	   static int n;
	    static int[] arr;
	    static int max=0;
	    static int max2=0;
	    static int sum =0;
	    static int limit;
	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        n = sc.nextInt();
	        arr= new int[n];
	        for(int i=0; i<n; i++){
	            int tmp=sc.nextInt();
	            if(tmp>max) max = tmp;
	            sum += tmp;
	            arr[i]= tmp;
	        }
	        limit = sc.nextInt();
	        Arrays.sort(arr);
	        if(sum<limit) {
	            System.out.println(max);
	        }else{
	  
	            binarySearch(0,max);
	            System.out.println(max2);
	        }
	         
	    }
	    static void binarySearch(int start, int end){
	        if(start>end) return;
	        int mid = (start + end)/2;
	        int innerSum = 0;
	        for(int i=0;i<arr.length;i++){
	        	int tmp=arr[i];
	        	if(mid<arr[i]) tmp=mid;
	            innerSum += tmp;
	        }
	        if(innerSum>limit){
	        	
	        	  binarySearch(start,mid-1);
	           
	        }else{
	        	if(max2<end) max2= mid;
	        	 binarySearch(mid+1,end);
	        }
	        
	    }
	}