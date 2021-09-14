package argo.math;
import java.util.*;
public class Parallelogram {

	
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Point a = new Point(sc.nextDouble(), sc.nextDouble());
        Point b= new Point(sc.nextDouble(), sc.nextDouble());
        Point c= new Point(sc.nextDouble(), sc.nextDouble());
        System.out.println((a.x-b.x)*(a.x-c.y)+"+"+(a.x-c.x)*(a.y-b.y));
        if((a.x-b.x)*(a.y-c.y)==(a.x-c.x)*(a.y-b.y)) {
        	System.out.print(-1);
        	return;
        }
        double l1 = getLen(a,b);
        double l2 = getLen(a,c);
        double l3 = getLen(c,b);
        double r1 = 2*l1+2*l2;
        double r2 = 2*l3+2*l2;
        double r3 = 2*l3+2*l1;
        double tmp = Math.max(r2, r3);
        double max = Math.max(r1, tmp);
        tmp = Math.min(r2, r3);
        double min = Math.min(r1, tmp);
        System.out.print(max-min);
    }
    
    static class Point{
        double x;
        double y;
        Point(double x, double y){
            this.x = x;
            this.y = y;
        }
    }
    static double getSlope(Point a, Point b) {
    	double slope = (a.y-b.y)/(a.x-b.x);
    	return slope;
    }
    static double getLen(Point a, Point b) {
    	
    	return Math.pow(Math.pow(a.x-b.x, 2)+Math.pow(a.y-b.y, 2),0.5);
    }
}