package argo.string;
import java.util.*;
public class Per10th {
    static StringBuilder sb;
    static String str;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        sb = new StringBuilder();
        for(int i =0; i <str.length(); i++){
              sb.append(str.charAt(i));
            if((i+1)%10==0&&i!=1) sb.append("\n");
        }
        System.out.print(sb);
        
    }
}