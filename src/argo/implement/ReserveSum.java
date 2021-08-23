package argo.implement;
import java.util.*;
public class ReserveSum {
    static int n;
    static int m;
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        
        System.out.print(rev(rev(n)+rev(m)));
    }
    static int rev(int num){
        int len = (int) (Math.log10(num));
        int reverse = 0;
        for(int i = len ; i >= 0 ; i--){
            reverse+= Math.pow(10,i)*(num%10);
            num /=10;
        }
        return reverse;           
    }
         
}