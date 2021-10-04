package argo.implement;
import java.util.*;
public class King {	
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	Unit ston  = new Unit((String) sc.next());
    	Unit king = new Unit((String) sc.next());
    	int n = sc.nextInt();
    	for(int i =0; i < n ; i++) {
    		String cmd = sc.next();
    		ston.move(cmd);
    		king.move(cmd);
    		
    	}
    	System.out.println(ston.getAnswer());
    	System.out.print(king.getAnswer());
    	
    	
	}
    static class Unit{
    	int row;
    	char col;
    	public Unit(String str) {
    		this.row = Integer.parseInt(str.charAt(1)+"");
    		this.col = str.charAt(0); 
    	}
    	public void move(String cmd) {
    		if(cmd.equals("R")) {
    			if(this.col<'H') this.col =(char) (this.col+1);
    		}else if(cmd.equals("L")) {
    			if(this.col>'A') this.col = (char) (this.col-1);
    		}else if(cmd.equals("B")) {
    			if(this.row>1) this.row = this.row-1;
    		}else if(cmd.equals("T")) {
    			if(this.row<8) this.row = this.row+1;
    		}else if(cmd.equals("RT")) {
    			if(this.col<'H'&&this.row<8) { 
    				this.col = (char) (this.col+1);
    				this.row = this.row+1;
    			}
    		}else if(cmd.equals("LT")) {
    			if(this.col>'A'&&this.row<8) { 
    				this.col = (char) (this.col-1);
    				this.row = this.row+1;
    			}
    		}else if(cmd.equals("RB")) {
    			if(this.row>1&&this.col<'H') {
    				this.col = (char) (this.col+1);
    				this.row = this.row-1;
    			}
    		}else if(cmd.equals("LB")) {
    			if(this.row>1&&this.col>'A') {
    				this.col = (char) (this.col-1);
    				this.row = this.row-1;
    			}
    		}
    	}
    	public String getAnswer() {
    		return ((char)this.col)+(this.row+"") ;
    	}
    }
}
