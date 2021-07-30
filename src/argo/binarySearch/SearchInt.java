package argo.binarySearch;
import java.util.*;
public class SearchInt {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<n ;i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ;i<m ; i++){
            int tmp = binarySearch(arr, sc.nextInt(), 0, n-1);
            sb.append((tmp==-1? 0:1)+"\n");
        }
        System.out.println(sb);
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        if(start>end) return -1;
        
        int mid = (start+end)/2;
        
        if(arr[mid]==target){
            return mid;
        }else{
            if(target> arr[mid]){
                return binarySearch(arr, target, mid+1, end);
            }else{
                return binarySearch(arr, target, start, mid-1);
            }
        }
    }
}