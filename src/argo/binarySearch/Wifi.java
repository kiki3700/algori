package argo.binarySearch;
import java.util.*;
public class Wifi {
    static int n;
    static int m;
    static int[] arr;
    static int ans;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m= sc.nextInt();
        arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        binarySearch(1, arr[arr.length-1]-arr[0]);
        System.out.println(ans);
    }
    static void binarySearch(int start, int end){
        if(start>end) return;
        int mid = (start+end)/2;
        int count =1;
        int sp = arr[0];
        for(int i =0; i<arr.length;i++){
        	int d= arr[i]-sp;
            if(mid<=d){
                count++;
                sp = arr[i];
            }
        }
        if(count>=m){
            ans =mid;
            binarySearch(mid+1, end);
        }else{
            binarySearch(start, mid-1);
        }
        
    }
}