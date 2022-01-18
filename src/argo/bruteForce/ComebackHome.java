package argo.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ComebackHome {
	static boolean[][] visit;
	static char[][] arr;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static int r, c, t;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		t = Integer.parseInt(st.nextToken());
		visit =new  boolean[r][c];
		arr = new char[r][c];
		for(int i = 0 ; i <r ; i++) {
			String str = br.readLine();
			for(int j = 0 ; j < c;j++) {
				arr[i][j] =  str.charAt(j);
			}
		}
		System.out.println(search(r-1,0, visit, 0));
	}
	static int search(int y, int x, boolean[][] vis, int T) {
		if(y==0&& x==c-1 && t==T) return 1;
		int ret =0;
		vis[y][x]=true;
		for(int i = 0; i < 4 ; i++) {
			int nx =x+ dx[i];
			int ny = y + dy[i];
			if(nx<0||nx>=c || ny>=r || ny<0) continue;
			if(arr[ny][nx]!='T') continue;
			if(vis[ny][nx]) continue;
			ret += search(ny,nx,vis,T+1);
		}
		vis[y][x] = false;
		return ret;
	}
}
