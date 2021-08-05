package argo.bruteForce;

import java.util.*;

public class Decomposition {
    static int n;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int ans=0;
        for(int i = 0; i<n;i++){
            if(deco(i)+i==n){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
    static int deco(int num){
        int sum =0;
        while(num>0){
            sum += num%10;
            num /=10;
        }
        return sum;
    }
}