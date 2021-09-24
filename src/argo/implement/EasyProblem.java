package argo.implement;
import java.util.*;
public class EasyProblem {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr =new int[1002];
        int count = 1;
        for(int i =1; i<=1000;i++) {
        	for(int j=0;j<i;j++) {
        		if(count==1001)break;
        		arr[count]=i;
        		count++;
        	}
        }
        	int sum = 0;
        	for(int i =n; i<=m;i++) {
        		sum +=arr[i];
        	}
        	System.out.print(sum);
        
    }
}