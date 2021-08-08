package argo.bruteForce;
import java.util.*;
public class EndNumber {
    static int n;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int ans = EndNumber(n);
        System.out.print(ans);
    }
    static int EndNumber(int count){
        int cnt=0;
        for(int i=666; i < Integer.MAX_VALUE;i++){
            if((i+"").contains("666")) cnt++;
            if(cnt == count) return i;
        }
        return -1;
    }
}