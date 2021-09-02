package argo.dfsAndBfs;
import java.util.*;
public class OrganicCabbage {
	    static StringBuilder sb;
	    static boolean[][] arr;
	    static boolean[][] visit;
	    static int t;
	    static int m;
	    static int n;
	    static int k;
	    static int count = 0;
	    static Queue<int[]> q;
	    static int[] dx = {-1,0,1,0};
	    static int[] dy = {0,-1,0,1};
	    public static void main(String[] args){
	        sb = new StringBuilder();
	        Scanner sc = new Scanner(System.in);
	        t = sc.nextInt();
	        for(int i = 0; i < t; i++){
	        	q = new LinkedList<>();
	        	count = 0;
	            m = sc.nextInt();
	            n = sc.nextInt();
	            arr = new boolean[m+2][n+2];
	            visit = new boolean[m+2][n+2];
	            k = sc.nextInt();
	            for(int j = 0; j < k; j++){
	                int x = sc.nextInt()+1;
	                int y = sc.nextInt()+1;
	                arr[x][y]=true;
	            }
	            for(int x = 1; x <= m; x++) {
	            	for(int y = 1; y <= n; y++) {
	            		if(!visit[x][y]&&arr[x][y]) {
	            			bfs(x, y);
	            			count++;
	            		}
	            }
	        }
	        sb.append(count+" ");
	    }
	        System.out.print(sb);
    }
	    static void bfs(int x, int y){
	        int[] a = new int[2];
	        a[0]=x;
	        a[1]=y;
	        q.offer(a);
	        visit[x][y]=true;
	        while(!q.isEmpty()) {
	        	int[] c =q.poll();
	        	for(int i = 0 ; i < 4; i++) {
	        		int x2 = c[0]+dx[i];
	        		int y2= c[1] +dy[i];
	        		if(arr[x2][y2] && !visit[x2][y2]) {
	        			visit[x2][y2] =true;
	        			int[] b = new int[2];
	        			b[0]= x2;
	        			b[1]= y2;
	        			q.offer(b);
	        		}
	        	}
	        }
	        
	    }
	}
		