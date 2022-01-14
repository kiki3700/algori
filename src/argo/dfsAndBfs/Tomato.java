package argo.dfsAndBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Tomato {
	static int[] dy = {1,0,-1,0};
	static int[] dx = {0,1,0,-1};
	static int[][] box;
	static boolean[][] visit;
	static int row;
	static int col;
	static Queue<To> q = new LinkedList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		col = Integer.parseInt(st.nextToken());
		row = Integer.parseInt(st.nextToken());
		box = new int[row][col];
		
		for(int i = 0 ; i <row ; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j <col; j++) {
				int tmp = Integer.parseInt(st.nextToken());
				box[i][j] = tmp;
				if(tmp == 1) {
					q.add(new To(j,i));
				}
			}
		}
		int ans = bfs();
		System.out.println(ans);
		
	}
	static int bfs() {
		while(!q.isEmpty()) {
			To t = q.poll();
			for(int i = 0 ; i <4 ; i++) {
				int c = t.x+dx[i];
				int r = t.y+dy[i];
				if(c>=0&&r>=0&&col>c&&row>r) {
					if(box[r][c]==0) {
						q.add(new To(c,r));
						box[r][c]= box[t.y][t.x]+1;
					}
				}
			}
		}
		int result = Integer.MIN_VALUE;
		for(int i = 0 ; i < row; i++) {
			for(int j = 0 ; j <col ;j++) {
				if(box[i][j]==0) return -1;
				result = Math.max(result, box[i][j]);
			}
		}
		return result-1;
	}
	static class To{
		int x;
		int y;

		public To(int x, int y) {
			this.x = x;
			this.y = y;
			
		}
	}
}
