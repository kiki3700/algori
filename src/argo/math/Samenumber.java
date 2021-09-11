package argo.math;

import java.util.*;
public class Samenumber {
    static long n;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
	    long sum = 0;
        for(int i = 1 ; i < n; i++){
            sum += (n*i+i);
        }
        System.out.print(sum);
    }
}