package argo.dfsAndBfs;




import java.util.*;
public class converstionWord {
	    static boolean[] visit;
	    static int c;
	    public int solution(String begin, String target, String[] words) {
	        c = 50;
	        int len = words.length;
	        
	        visit = new boolean[len];
	        dfs(begin, target, words, 0);
	        return  c==50? 0: c;
	        
	    }
	    static void dfs(String begin, String target, String[] words, int count){
	        if(begin.equals(target)) {
	           c= Math.min(c, count);
	            System.out.print(c);
	        }
	        for(int i=0;i<words.length;i++){
	            if(checkDiff(begin, words[i])&&!visit[i]){
	                visit[i]=true;
	                dfs(words[i],target, words, count+1);
	                visit[i]=false;
	            }
	        }
	    }
	    static boolean checkDiff(String first, String second){
	        int diff =0;
	        boolean check= false;
	        for(int i=0; i< first.length();i++){
	            if(first.charAt(i)==second.charAt(i)) {
	                diff++;
	            }
	        }
	        if(diff==first.length()-1) check =true;
	        return check;
	    }
	}