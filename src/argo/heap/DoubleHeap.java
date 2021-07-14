package argo.heap;
import java.util.*;
public class DoubleHeap {


    static PriorityQueue<Integer> maxq;
    static PriorityQueue<Integer> minq;
    public int[] solution(String[] operations) {
        maxq = new PriorityQueue<Integer>(Collections.reverseOrder());
        minq = new PriorityQueue<Integer>();
        int len = operations.length;
        for(int i=0; i< len ; i++){
           String[] order = operations[i].split(" ");
            switch(order[0]){
                case "I":
                    int  ob = Integer.parseInt(order[1]);
                    maxq.offer(ob);
                    minq.offer(ob);
                    break;
                case "D":
                    if(Integer.parseInt(order[1])==1){
                        if(!maxq.isEmpty()){
                        int max = maxq.poll();
                        minq.remove(max);
                        }
                    }else{
                        if(!maxq.isEmpty()){
                        int min = minq.poll();
                        if(!maxq.isEmpty()) maxq.remove(min);
                        }
                    }
                    break;
            }
        }
        
        int[] answer = new int[2];
        int max =0;
        int min =0;
        if(!maxq.isEmpty()) max = maxq.poll();
        if(!minq.isEmpty()) min = minq.poll();
        answer[0] = max;
        answer[1] =min;
        return answer;
    }
}