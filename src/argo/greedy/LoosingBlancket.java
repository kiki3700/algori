package argo.greedy;
import java.util.*;

public class LoosingBlancket{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("-");
        int sum = 0;
        for(int i = 0 ; i<str.length; i++){
            String[] innerStr = str[i].split("\\+");
            int innerSum = 0;
            for(int j = 0; j<innerStr.length; j++){
                innerSum += Integer.parseInt(innerStr[j]);
            }
            if(i>0){
                sum -= innerSum;
            }else{
                sum += innerSum;
            }
        }
        System.out.println(sum);
    }
}