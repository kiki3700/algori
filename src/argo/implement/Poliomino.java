';lkjlkj'
package argo.implement;
import java.util.*;
public class Poliomino {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		LinkedList<Board> list = new LinkedList<>();
		Board pre = new Board("", 0);
		
		
		for(int i = 0; i <str.length();i++) {
			Board bod;
			if(!(str.charAt(i)+"").equals(pre.type)) {
				bod = new Board(str.charAt(i)+"",1);
				list.add(bod);
			}else {
				bod = list.pollLast();
				bod.len=bod.len+1;
				list.add(bod);
			}
			pre = bod;
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i<list.size();i++) {
			Board b = list.pollFirst();
			int n = b.len;
			System.out.println(n);
			if(b.type.equals("X")) {
				while(n>0) {
					if(n>=4) {
						sb.append("AAAA");
						n-=4;
					}else if(n==2) {
						sb.append("BB");
						n-=2;
					}else {
						System.out.print(-1);
						return;
					}
				}
			}else {
				for(int j = 0; j<n; j++) {
					sb.append(".");
				}
			}
		}
		System.out.print(sb);
	}
	static class Board{
		String type;
		int len;
		public Board(String type, int len) {
			this.type = type;
			this.len = len;
		}
	}
}
