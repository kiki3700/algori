package argo.dfsAndBfs;
import java.util.*;

public class countApartment {



    static int[][] map;
    static boolean[][] visit;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static PriorityQueue<Integer> heap;
    static int count = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        map = new int[n+2][n+2];
        visit = new boolean[n+2][n+2];
       
        heap = new PriorityQueue<>();
        for(int i = 1; i<=n;i++){
        	String s =sc.next();
            for(int j=1; j<=n;j++){
                map[i][j]=s.charAt(j-1)-'0';
            }
        }
        for(int i = 1 ; i<=n;i++){
            for(int j = 1 ; j<=n;j++){
                if(!visit[i][j]&&map[i][j]==1){
                    bfs(i,j);
                }
            }
        }
        System.out.println(heap.size());
        while(!heap.isEmpty()){
            System.out.println(heap.poll());
        }
    }
    
    static void bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        int[] arr = {x,y};
        q.offer(arr);
        count++;
        visit[x][y]=true;
        while(!q.isEmpty()){
            int[] tmp = q.poll();
            for(int i=0; i<4;i++){
                if(map[tmp[0]+dx[i]][tmp[1]+dy[i]]==1&&!visit[tmp[0]+dx[i]][tmp[1]+dy[i]]){
                	int[] arr2 = {tmp[0]+dx[i],tmp[1]+dy[i]};
                   q.offer(arr2);
                   count++;
                   visit[tmp[0]+dx[i]][tmp[1]+dy[i]]=true;
                }

            }

        }
        heap.offer(count);
        count=0;
    }
}