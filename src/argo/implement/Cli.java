package argo.implement;
import java.util.*;
public class Cli {
    static int n;
    static boolean[] arr;
    static String[] strArr;
    static StringBuilder ans;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        strArr = new String[n];
        ans = new StringBuilder();
        for(int i = 0; i< n ; i++){
            strArr[i]= sc.next();
        }
        CLI();
        System.out.print(ans);
    }
    static void CLI(){
        String base = strArr[0];
        arr = new boolean[base.length()];
        Arrays.fill(arr,true);
        for(int i = 1; i<n;i++){
            for(int j = 0;j<base.length();j++){
                if(arr[j]){
                    if(base.charAt(j)!=strArr[i].charAt(j)) arr[j]=false;
                }
            }
        }
        for(int i =0;i<base.length();i++){
            if(arr[i]){
                ans.append(base.charAt(i));
            }else{
                ans.append('?');
            }
        }
    }
}