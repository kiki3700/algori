package argo.dfsAndBfs;
import java.util.*;

public class War {
	static int n;
	static int m;
	static char[][] arr;
	static boolean[][] visited;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new char[m+2][n+2];
		visited = new boolean[m+2][n+2];
		int[] power = new int[] {0,0};
		for(int i = 1 ; i <= m; i++) {
			String tmp = sc.next();
			for(int j = 1 ; j <=n; j++) {
				arr[i][j]= tmp.charAt(j-1);
			}
		}
		for(int i = 1; i <=m; i ++) {
			for(int j = 1; j<=n; j++) {
				if(!visited[i][j]) {
					int pow = dfs(arr[i][j], i, j);

					if(arr[i][j]=='B') {
						power[1]+=Math.pow(pow, 2);
					}else if(arr[i][j]=='W') {
						power[0]+=Math.pow(pow, 2);
					}
				}
			}
		}
		System.out.print(power[0]+" "+power[1]);
	}
	static int dfs(char which, int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {x, y});
		visited[x][y]= true;
		int cnt = 1;
		while(!q.isEmpty()) {
			int[] a = q.poll();
			
			for(int i = 0 ; i < 4; i++) {
				if(arr[a[0]+dx[i]][a[1]+dy[i]]==which && !visited[a[0]+dx[i]][a[1]+dy[i]]) {
					q.offer(new int[] {a[0]+dx[i],a[1]+dy[i]});
					visited[a[0]+dx[i]][a[1]+dy[i]]= true;
					cnt++;
					}
				}
			}
		return cnt;
		}
	
	}

