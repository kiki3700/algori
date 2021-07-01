package argo.graph;
import java.util.*;

public class farestNode {



    static boolean[][] map;
    static int[] visit;
    static int max;
    static int count;
    public int solution(int n, int[][] edge) {
        max =-1;
        map = new boolean[n+1][n+1];
        visit = new int[n+1];
        Arrays.fill(visit,0);
        
        for(int i=0;i<edge.length;i++){
            int from = edge[i][0];
            int to = edge[i][1];
            map[from][to]=true;
            map[to][from]=true;
        }
        
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        visit[1]=1;
        while(!q.isEmpty()){
            int tmp = q.poll();
            for(int i=1;i<=n;i++){
                if(map[tmp][i]&&visit[i]==0){
                    q.add(i);
                    visit[i]=visit[tmp]+1;
            
                    if(visit[i]>max){

                        count=1;
                        max=visit[i];
                    }else if(visit[i]==max){

                        count++;
                    }
                }
            }
           
    }
            return count;
        }
    }