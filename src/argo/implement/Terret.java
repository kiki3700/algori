package argo.implement;
import java.util.*;
public class Terret {
    static StringBuilder sb;
    static int n;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sb = new StringBuilder();
        n = sc.nextInt();
        for(int i = 0; i < n; i++) {
        	int x1 = sc.nextInt();
        	int y1 = sc.nextInt();
        	int r1 = sc.nextInt();
        	int x2 = sc.nextInt();
        	int y2 = sc.nextInt();
        	int r2 = sc.nextInt();
        	sb.append(getDistance(x1,y1,r1,x2,y2,r2)+"\n");
        }
        System.out.print(sb);
    }
    static int getDistance(int x1, int y1, int r1, int x2, int y2, int r2){
  
    	
        int ans = 0;
        int dist1 = (int) (Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
    	int dist2 = (int) Math.pow(r1+r2,2);
    	int dist3 = (int) Math.pow(r1-r2,2);
    	if(x1==x2&&y1==y2&&r1==r2) {
            ans = -1;
    	}else if(dist1==dist2){
    		ans =1;
    	}else if( dist1== dist3 ){
            ans =1;
        }
        else if(dist1 < dist3) {
    		ans =0; 
    	}else if (dist1 >dist2){
            ans = 0;
        }
        else{
            ans = 2;
        }
    	return ans;
    }
}
 