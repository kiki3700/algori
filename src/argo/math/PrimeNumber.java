package argo.math;
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int from = sc.nextInt();
        int to = sc.nextInt();
        for(int i = from; i<=to; i++){
            boolean flag = true;
            
            for(int j= 2; j<=Math.sqrt(i);j++){
            	
                if(i%j==0){
                    flag =false;
                    break;
                }
        
            }
            if(i <= 1) flag = false;
            if(flag){
                sb.append(i+"\n");
            }
        }
        System.out.print(sb);
    }
}