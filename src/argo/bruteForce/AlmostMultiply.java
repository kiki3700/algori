package argo.bruteForce;
import java.util.*;

public class AlmostMultiply {
    static int[] arr = new int[5];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);        
        for(int i = 0; i < 5; i++){
            arr[i]=sc.nextInt();
        }
        
        int ans = 1;
        boolean flag = false;
        while(!flag){
            int count = 0;
            for(int i = 0; i < 5; i++){
                if(ans%arr[i]==0) count++;
            }
            if(count>=3) break;
            ans++;
        }
        System.out.print(ans);
    }
}