package argo;
import java.util.*;
public class Dice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i = 0; i < 3; i++){
            arr[i]=sc.nextInt();
        }
        int max = Math.max(arr[0],Math.max(arr[1],arr[2]));
        int cnt = 1;
        if(arr[0]==arr[1]&&arr[1]==arr[2]){
               cnt = 3;
            max = arr[0];
        }else if(arr[0]==arr[1]||arr[0]==arr[2]){
            cnt=2;
            max = arr[0];
        }else if(arr[1]==arr[2]){
            cnt = 2;
            max = arr[1];
        }
        if(cnt ==3){
            System.out.print(10000+max*1000);
        }else if(cnt == 2){
            System.out.print(1000+max*100);
        }else{
            System.out.print(max*100);
        }
    }
}