package argo;
import java.util.*;
public class Remain {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        sc =new Scanner(System.in);
        sc.close();
        System.out.println((a+b)%c);
        System.out.println(((a%c)+(b%c))%c);
         System.out.println(a*b%c);
        System.out.println(((a%c)*(b%c))%c);
    }
}