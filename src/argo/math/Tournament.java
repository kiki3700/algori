package argo.math;
import java.util.*;
public class Tournament {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt()-1;
        int b = sc.nextInt()-1;
        int i = 0;
        while(true){
        	i++;
            a= a/2;
            b= b/2;
            if(a== b){
                System.out.print(i);
                break;
            }
        }
    }
}