package argo.bruteForce;
import java.util.*;
public class BlackJack {
    static int n;
    static int m;
    static int[] arr;
    static boolean[] visited;
    static PriorityQueue<Integer> pq;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m= sc.nextInt();
        arr = new int[n];
        visited = new boolean[n];
        pq = new PriorityQueue<>((o1,o2)->o2-o1);
        for(int i = 0 ; i< n ; i++){
            arr[i]= sc.nextInt();
        }
        findMax();
        System.out.print(pq.poll());
    }
    static void findMax(){
        for(int i = 0; i<n-2; i++){
            for(int j = i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    int tmp = arr[i]+arr[j]+arr[k];
                    if(tmp <= m) pq.offer(tmp);
                }
            }
        }
    }
}