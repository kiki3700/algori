package argo.greedy;
import java.util.*;


public class GasStation {



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] len = new long[n-1];
        long[] price = new long[n];
        for(int i = 0; i<n-1;i++){
            len[i]= sc.nextInt();
        }
        for(int i = 0 ; i<n; i++){
            price[i]= sc.nextInt();
        }
        long min = Long.MAX_VALUE;
        long sum = 0;
        for(int i = 0; i<n-1;i++){
            if(min > price[i])min = price[i];
            sum += min*len[i];
        }
        System.out.println(sum);
    }
}