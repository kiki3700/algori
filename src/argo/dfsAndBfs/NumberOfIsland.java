package argo.dfsAndBfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class NumberOfIsland {
	static BufferedReader br;
	static BufferedWriter bw;


	static int[] dx = {1,0,-1,0,1,1,-1,-1};
	static int[] dy = {0,1,0,-1,-1,1,1,-1};
	public static void main(String[] args) throws IOException {
		StringTokenizer st;
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			st = new StringTokenizer(br.readLine());
			int c = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			if(r==0&&c==0) break;
			boolean[][] visit = new boolean[r][c];
			int[][] arr = new int[r][c];
			for(int i = 0 ; i < r; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0 ; j<c ;j++) {
					arr[i][j]=Integer.parseInt(st.nextToken());
				}
			}
			int sum =  0;
			for(int i = 0; i < r; i++) {
				for(int j = 0; j <c;j++) {
					Point p = new Point(j, i);
					if(arr[i][j]==1&& !visit[i][j]) {
						sum += search(p, visit, arr, r, c);
					}
				}
			}
			bw.write(sum+"\n");
		}
		br.close();
		bw.flush();
	}
	static int search(Point p, boolean[][] visit, int[][] arr,int r, int c) {
		Stack<Point> s= new Stack<>();
		s.add(p);
		visit[p.y][p.x]=true;
		while(!s.isEmpty()) {
			Point po = s.pop();
			for(int i = 0 ; i < 8; i++) {
				int px = po.x+dx[i];
				int py = po.y+dy[i];
				if(px<0||py<0||px>(c-1)||py>(r-1)) continue;
				if((!visit[py][px])&&(arr[py][px]==1)) {
					Point np = new Point(px,py);
					s.add(np);
					visit[py][px]=true;
				}
			}
		}
		return 1;
	}
}
class Point{
	int x;
	int y;
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
}


