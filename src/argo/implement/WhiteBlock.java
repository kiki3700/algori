package argo.implement;
import java.util.*;
public class WhiteBlock {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for(int i = 0 ; i<8; i++){
            String tmp = sc.next();
            for(int j = 0; j<8; j++){
                char c = tmp.charAt(j);
                if((i+j)%2==0&& c=='F') count++;
            }
        }
        System.out.print(count);
    }
}