package argo.implement;
import java.util.*;
public class Ave {
    static int n;
    static int[] arr;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        int max = 0;
        for(int i = 0; i < n ; i++){
            int tmp = sc.nextInt();
            if(max < tmp ) max = tmp;
            arr[i] = tmp;
        }
        float sum = 0;
        for(int i = 0; i < n ; i++) {
        	sum += (float) arr[i]/max;
        }
        System.out.print(sum/n*100);
    }
}