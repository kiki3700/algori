package argo.HashMap;
import java.util.*;
public class BasketBall {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            String tmp = sc.next();
            char LN = tmp.charAt(0);
            map.put(LN, map.getOrDefault(LN,0)+1);
        }
        Object[] key =  map.keySet().toArray();
        Arrays.sort(key);
        for(int i =0; i < key.length; i++) {
        	if(5<=map.get((char) key[i])) {
        		sb.append((char) key[i]);
        	}
        }
        if(sb.length()==0) {
        	System.out.print("PREDAJA");
        }else {
        	System.out.print(sb);
        }
    }
}