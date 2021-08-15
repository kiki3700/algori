package argo.implement;
import java.util.*;
public class max {
    static int max=0;
    static int th=-1;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i =0; i < 9; i++){
            int tmp = sc.nextInt();
            if(max < tmp){
                max = tmp;
                th = i+1;
            }
        }
        System.out.println(max);
        System.out.println(th);
    }
}