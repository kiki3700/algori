package argo.bruteForce;
import java.util.*;
public class Chess {
    static int n;
    static int m;
    static int[][] arr;
    static int[][] bw;
    static int[][] wb;
    
    public static void main(String[] args){
        bw = new int[8][8];
        wb = new int[8][8];
        int cnt = 1;
        for(int i = 0 ; i < 8 ;i++){
            for(int j=0; j <8 ; j++){
                if(cnt%2==1){
                    bw[i][j]=1;
                    wb[i][j]=0;
                }else{
                    bw[i][j]=0;
                    wb[i][j]=1;
                }
                cnt++;
            }
            cnt++;
        }
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n][m];
        for(int i = 0; i < n ;i++) {
        	String str = sc.next();
        	
        	for(int j = 0 ; j < m; j++) {
        		char ch = str.charAt(j);
        		if(ch == 'B') {
        			arr[i][j]=1;
        		}else {
        			arr[i][j]=0;
        		}
        	}
        }

        
        int min = 64;
        for(int i = 0 ; i<=(n-8); i++) {
        	for(int j = 0 ;j<=(m-8); j++){
        		int bc = 64;
        		int wc = 64;
        		for(int x = 0;x<8;x++) {
        			for(int y = 0;y<8;y++) { 		
        				if(arr[x+i][y+j]==bw[x][y]) {
        					bc--;
        				}
        				if(arr[x+i][y+j]==wb[x][y]) {
        					wc--;
        				}
        			}
        		}
        		min=Math.min(min, Math.min(wc, bc));
        	}
        }
        System.out.print(min);

    }

    
    
}