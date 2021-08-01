package argo.binarySearch;

import java.util.*;

public class NumCard2asHashMap {



    static HashMap<Integer, Integer> map;
    static int n;
    static int m;
    static StringBuilder sb;
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        n = sc.nextInt();
        map = new HashMap<>();
        for(int i = 0; i<n; i++){
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        m = sc.nextInt();
        sb = new StringBuilder();
        for(int i = 0; i < m ; i++){
            int target= sc.nextInt();
            sb.append(map.getOrDefault(target,0)+" ");
        }
        System.out.print(sb);
    }
}