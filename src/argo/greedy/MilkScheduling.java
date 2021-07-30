package argo.greedy;
import java.util.*;


public class MilkScheduling {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n;i++){
            int milk = sc.nextInt();
            int dur = sc.nextInt();
            if(map.getOrDefault(dur,-1)<milk){
                map.put(dur,milk);
            }
        }
        int sum =0;
        for(int key : map.keySet()){
            sum += map.get(key);
        }        
        System.out.println(sum);
    }
}