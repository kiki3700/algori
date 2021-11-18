package argo.math;
import java.util.*;
public class BeApartmentCaptin {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int len = sc.nextInt();
        for(int i = 0; i<len;i++){
            int k = sc.nextInt();
            int n = sc.nextInt();
            int ans = getPeople(k, n);
            System.out.println(ans);
        }
        sc.close();
    }
    static int getPeople(int k , int n){
        int[][] arr = new int[k+1][n+1];
        
        for(int i = 1; i<=n; i++){
            arr[0][i]=i;
        }
        for(int i = 1 ; i<=k; i++){
            for(int j=1; j <=n ; j++){
                arr[i][j]=arr[i-1][j]+arr[i][j-1];
            }
        }
        return arr[k][n];
    }
}