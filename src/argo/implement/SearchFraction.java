package argo.implement;
import java.util.*;
public class SearchFraction {
    static int n;
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	n = sc.nextInt();
        int[] arr  = find(n);
        int mom = 0;
        int son = 0;
        int th = arr[1];
        int sum = arr[0];
        if(arr[1] % 2 == 0){

            mom = th;
            son = 1;
            for(int i = 1; i < n-sum; i++){
                mom--;
                son++;
            }
        }else{
            mom = 1;
            son = th;
            for(int i = 1; i < n-sum; i++){
                mom++;
                son--;
            }
        }
        System.out.print(son+"/"+mom);
        
    }
    static int[] find(int n){
        int sum = 0;
        int th = 0;
        while(sum < n){
        	
            th++;
            sum += th;

        }
        int[] arr = new int[2];
        arr[0]=sum-th;
        arr[1]=th;
       return arr;
       
    }
}