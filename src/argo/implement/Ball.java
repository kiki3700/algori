package argo.implement;
import java.util.*;
public class Ball {
    static int[] arr;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        arr = new int[3];
        arr[0] = 1;
        for(int i = 0; i<n ; i++){
            int from =sc.nextInt()-1;
            int to = sc.nextInt()-1;
            int tmp = arr[from];
            arr[from] = arr[to];
            arr[to]= tmp;
        }
        int where=0;
        for(int i = 0 ; i < 3; i++){
            if(arr[i]==1) where = i+1;
        }
        System.out.print(where);
    }
}