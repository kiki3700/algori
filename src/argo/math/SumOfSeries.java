package argo.math;
import java.util.*;
import java.io.*;
public class SumOfSeries {
	static double t;
	static int l;
	static BufferedWriter bw;
	static boolean flag;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        t = Double.parseDouble(input[0]);
        l = Integer.parseInt(input[1]);
        
        for(int i =l; i<=100; i++) {
        	getSum(i);
       
        	if(flag) {
        		break;
        	}
        }
        if(!flag) {
        	bw.write("-1");
        }
        
        bw.flush();
    }
    
    static int getSum(int cnt) throws IOException {
    	double sum = 0;
    	int diff = cnt/2;
    	int base = (int) (t/cnt);
    	int end = base+diff;
    	int start = base-diff;
    	if(cnt%2==0) {
    		start +=1;
    	}
    	if(start <0) return 1;
    	for(int i = start; i <= end; i++) {

    		sum += i;
    	}
    	if(sum == t) {
    		flag = true;
        	for(int i = start; i <= end; i++) {
        		if(i == base+diff) {
            		bw.write(i+"");
        		}else {
            		bw.write(i+" ");
        		}
        	}
    	}
    	return 1;
    }
    
}
