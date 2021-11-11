package argo.math;
import java.util.*;
public class BinomialCoefficient {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int ans = fac(n)/(fac(k)*fac(n-k));
        System.out.println(ans);
    }
    static int fac(int a){
        int result = 1;
        for(int i = 1; i <=a; i++){
            result *= i;
  
        }
        return result;
    }
}