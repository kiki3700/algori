package argo.dfsAndBfs;
import java.util.*;
public class Cycle {

    static boolean[][] map;
    static boolean[] visit;


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t;i++){
            int count=0;
            int n = sc.nextInt();
            map = new boolean[n+1][n+1];

            visit = new boolean[n+1];
            for(int x=1;x<=n;x++){
                int to = sc.nextInt();
                map[x][to]=true;
            }
            for(int x=1;x<=n;x++){
                if(!visit[x]){
                    count++;
                    dfs(x, n);
                }
            }
            System.out.println(count);
        }
    }
    static void dfs(int i, int n){
        Queue<Integer> q = new LinkedList<>();
        q.offer(i);
        visit[i]=true;
        while(!q.isEmpty()){
            int tmp = q.poll();
            for(int j=1;j<=n;j++){
                if(map[tmp][j]&&!visit[j]){
                    visit[j]=true;
                    q.offer(j);
                }
            }
        }
    }
}