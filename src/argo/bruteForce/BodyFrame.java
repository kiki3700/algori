package argo.bruteForce;
import java.util.*;

public class BodyFrame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        
        for(int i = 0; i < n ; i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n; i++){
            int count = 1;
            for(int j=0; j<n; j++){
                if(i==j) continue;
                if(arr[i][0]<arr[j][0]&&arr[i][1]<arr[j][1]) count++;
            }
            sb.append(count+" ");
        }
        System.out.print(sb);
    }
}