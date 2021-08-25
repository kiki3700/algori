package argo.queue;
import java.util.*;
public class Josepus {
    static Queue<Integer> q;
    static int n;
    static int m;
    static StringBuilder sb;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sb = new StringBuilder();
        n = sc.nextInt();
        m = sc.nextInt();
        q = new LinkedList<>();
        //큐 채워 넣기
        for(int i = 1; i <= n; i++){
            q.offer(i);
        }
        sb.append("<");
        //꺼내기 시작
        int i = 0;
        while(!q.isEmpty()) {
        	int tmp = q.poll();
        	i++;
        	if(i == m) {
        		sb.append(tmp+", ");
        		i=0;
        	}else {
        		q.offer(tmp);
        	}
        }
        sb.delete(sb.length()-2,sb.length());
        sb.append(">");
        //출력
        System.out.print(sb);
    }
}