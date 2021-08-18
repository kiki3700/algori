package argo.implement;
import java.util.*;

public class Palindrome {
    static StringBuilder sb;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sb = new StringBuilder();
        String tmp; 
        while(!(tmp=sc.next()).equals("0")){
            boolean flag = true;
            int len = tmp.length();
            for(int i = 0; i < len/2; i++){
                if(tmp.charAt(i)!=tmp.charAt(len-1-i)){
                    flag = false;
                }
            }
            if(flag){
                sb.append("yes\n");
            }else{
                sb.append("no\n");
            }
        }
        System.out.println(sb);
    }
}