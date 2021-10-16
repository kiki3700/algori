package argo.math;
import java.util.*;
import java.math.*;
public class findPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 0; i< n; i++){
               int num = sc.nextInt();
            if(findPrime(num)) count++;
        }
        System.out.println(count);
    }
    static boolean findPrime(int num){
        if(num == 1) return false;
        int len = (int) Math.sqrt(num);
        boolean ans = true;
        for(int i=2; i<=len ; i++){
            if(num %i==0 ) return false;
        }
        return ans;
    }
}