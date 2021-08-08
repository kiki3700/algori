package argo.dp;
import java.util.*;
public class SugarDelivery {
    static int n;
    static PriorityQueue<Integer> pq;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        pq = new PriorityQueue<>();
        int i=0;
        int j=0;
        boolean imax=false;
        boolean jmax=false;
        while(!jmax){
            imax=false;
            i=0;
            while(!imax){
                int tmp = 3*j+5*i;
                if(tmp==n) pq.offer(j+i);
                i++;
                if(tmp>n) imax=true;
            }
            if(j*3>n) jmax=true;
            j++;
        }
        int tmp=-1;
        if(!pq.isEmpty()) tmp = pq.poll();
        System.out.print(tmp);
    }

}