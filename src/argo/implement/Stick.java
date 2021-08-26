package argo.implement;
import java.util.*;
public class Stick {
    static int target;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        target = sc.nextInt();
        int count =0;
        int sum = 0;
        int len = 64;
        while(target>0){
 
            if(len > target){
                len /=2;       
            }else{
                count++;
                target -= len;
            }
  
        }
        System.out.print(count);
    }
}