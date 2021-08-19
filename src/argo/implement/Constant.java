package argo.implement;
import java.util.*;
public class Constant {
    static int x;
    static int y;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();

        x = Integer.parseInt(new StringBuilder().append(x).reverse().toString());
        y = Integer.parseInt(new StringBuilder().append(y).reverse().toString());
        
        System.out.print(x > y? x: y);
    }
}