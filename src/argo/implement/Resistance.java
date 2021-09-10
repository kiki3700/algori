package argo.implement;
import java.util.*;
public class Resistance {
	static HashMap<String, col> map;
	public static void main(String[] args) {
		map = new HashMap<>();
		map.put("black", new col(0,1));
		map.put("brown", new col(1,10));
		map.put("red", new col(2,100));
		map.put("orange", new col(3,1000));
		map.put("yellow", new col(4,10000));
		map.put("green", new col(5,100000));
		map.put("blue", new col(6,1000000));
		map.put("violet", new col(7,10000000));
		map.put("grey", new col(8,100000000));
		map.put("white", new col(9,1000000000));
		Scanner sc = new Scanner(System.in);
		String first = sc.nextLine();
		String second = sc.nextLine();
		String third = sc.nextLine();
		String tmp ="";
		tmp +=map.get(first).value;
		tmp +=map.get(second).value;
		long answer =(long)(Long.parseLong(tmp) * map.get(third).multi);
	
		System.out.print(answer);
	}
	static class col{
		int value;
		long multi;
		col( int value, long multi){
			this.value = value;
			this.multi = multi;
		}
	}
}
