package argo.class1;
import java.util.*;
public class Bep {
   
    static int fix;
    static int var;
    static int price;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        fix = sc.nextInt();
        var = sc.nextInt();
        price = sc.nextInt();
        if((price - var)!=0){
        int bep = fix/(price - var);
        if(bep>=0) System.out.print(bep+1);
        if(bep<0) System.out.print(-1);
        }else{
            System.out.print(-1);
        }
    }
}