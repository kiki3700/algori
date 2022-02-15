package argo;

import java.util.Scanner;

public class Alarm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		Time time = new Time(h,m);
		time.sub();
		System.out.println(time.toString());
	}
	
}
class Time{
	int hh;
	int mm;
	Time(int h, int m){
		this.hh = h;
		this.mm = m;
	}
	Time sub() {
		if(mm-45<0) {
			mm = mm+60 -45;
			hh -=1;
			if(hh<0) {
				hh +=24;
			}
		}else {
			mm -=45;
		}
		
		return this;
	}
	@Override
	public
	String toString() {
		return hh+ " "+mm;
	}
}
