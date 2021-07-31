package argo.binarySearch;
import java.util.*;

public class Main{
    static HashMap<Integer, Integer> map;
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        map = new HashMap<>();
        for(int i = 0 ; i<n ; i++){
            map.put(sc.nextInt(), 1);
        }
        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i =0 ; i<m; i++){
            int tmp = sc.nextInt();
            int ans = 0;
            if(map.containsKey(tmp)) ans =1;
            sb.append(ans+"\n");
        }
        System.out.println(sb);
    }
}


