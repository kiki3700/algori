package argo.implement;
import java.util.*;
public class OX {
    static StringBuilder sb;
    static int n ;
    public static void main(String[] args){
        sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);   
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String str = sc.next();
            int sum = 0;
            int plus = 0;
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j)=='O'){
                    plus++;
                }else{
                    plus=0;
                }
                sum+=plus;
            }
            sb.append(sum+"\n");
        }
        System.out.print(sb);
    }
}