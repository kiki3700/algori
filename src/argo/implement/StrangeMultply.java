package argo.implement;
import java.util.*;
public class StrangeMultply {
	  public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        String strN = sc.next();
	        String strM =sc.next();
	        int[] n = new int[strN.length()];
	        int[] m = new int[strM.length()];
	        for(int i = 0; i<strN.length();i++){
	            n[i]= Integer.parseInt(strN.charAt(i)+"");
	        }        
	     
	        for(int i = 0; i<strM.length();i++){
	            m[i]= Integer.parseInt(strM.charAt(i)+"");
	        }        
	        long sum = 0;
	        for(int i = 0 ; i < strN.length();i++){
	            for(int j = 0; j<strM.length();j++){
	                sum += n[i]*m[j];
	            }
	        }
	        System.out.print(sum);
	    }
	}
