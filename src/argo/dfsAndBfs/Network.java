package argo.dfsAndBfs;
import java.util.*;
/*https://programmers.co.kr/learn/courses/30/lessons/43162?language=java*/
public class Network {
    static boolean[] visit;
    static int count;
    static int[][] map;
    public int solution(int n, int[][] computers) {
        visit = new boolean[n];
        map = computers;
        count = 0;
        for(int i=0;i<map.length;i++){
            if(!visit[i]){
            bfs(i);
            count++;
                }
        }
        return count;
    }
    static void bfs(int n){
        if(visit[n]) return;
        visit[n]= true;
        for(int i = 0; i< map.length;i++){
            if(!visit[i]&&map[n][i]==1&&n!=i){
                bfs(i);
            }
        }
        
        }
    }
