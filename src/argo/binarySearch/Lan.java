package argo.binarySearch;
import java.util.*;
public class Lan {
    static int n;
    static int target;
    static long[] arr;
    static long max =0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        target = sc.nextInt();
        arr = new long[n];
        for(int i = 0 ; i <n ;i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        binarySearch(1, arr[arr.length-1]);
        System.out.println(max);
    }
    static void binarySearch(long start, long end){
        if(start>end) return;
        long mid = (start+end)/2;
        int count=0;
        for(int i = 0; i< arr.length; i++){
        	long tmp = arr[i]/mid;

            count += tmp;
        }
        if(count>=target){
        	if(max<mid) max = mid;
            binarySearch(mid+1,end);
        }else{
        	
            binarySearch(start, mid-1);
        }
    }
}