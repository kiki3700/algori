package argo.greedy;
import java.util.*;
public class ATM {
	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] arr =new int[n];
	        int[] sumArr = new int[n];
	        for(int i= 0; i<n;i++){
	            arr[i]=sc.nextInt();
	        }
	        Arrays.sort(arr);
	        int sum =0;
	        for(int i=0; i<n;i++){
	            sum += arr[i];
	            sumArr[i]= sum; 
	        }
	        sum=0;
	        for(int i=0;i<n;i++){
	            sum+=sumArr[i];
	        }
	        System.out.print(sum);
	    }
	}

