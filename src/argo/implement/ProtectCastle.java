package argo.implement;
import java.util.*;
public class ProtectCastle {

    static int n;
    static int m;
    static boolean[] row;
    static boolean[] col;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        row =new boolean[n];
        col = new boolean[m];
        for(int i = 0 ; i< n ; i++){
            // Çà ÀÐ±â
            String str = sc.next();
            for(int j = 0; j<m;j++){
                if(str.charAt(j)=='X'){
                    row[i]=true;
                    col[j]=true;
                }
            }

        }
             int rowSum = n;
            for(int i =0; i<n;i++){
                if(row[i]) rowSum--;
            }
            int colSum = m;
            for(int i =0; i<m; i++){
                if(col[i]) colSum--;
            }
            System.out.print(Math.max(rowSum,colSum));
    }
}