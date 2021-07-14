package argo.sort;
import java.util.*;
public class hindex {
    static int max;
    public int solution(int[] citations) {
        int len = citations.length;
        Arrays.sort(citations);
        
        for(int i=0;i<len;i++){
            int h = citations[i];
            int k = len-i;
            if(h>=k){
                max=k;
                break;
            }
        }
        
        
        return max;
    }
}