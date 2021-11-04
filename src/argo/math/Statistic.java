package argo.math;
import java.util.*;
public class Statistic {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i< n ; i++) {
			arr[i]= sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(mean(arr));
		System.out.println(median(arr));
		System.out.println(mode(arr));
		System.out.println(range(arr));
	}
	static long mean(int[] arr) {
		double sum = 0;
		for(int i = 0 ; i < arr.length; i++) {
			sum += (double) arr[i];
		}
		double mean = Math.round(sum/arr.length);
		return (int)Math.ceil(mean);
	}
	
	static int median(int[] arr) {
		int n = arr.length;
		if(n%2==0) {
			//even
			int a = arr[n/2];
			int b = arr[(n-1)/2];
			return (a+b)/2;
		}else {
			return arr[(n-1)/2];
		}
	}
	static int range(int[] arr) {
		return arr[arr.length-1]-arr[0];
	}
	static int mode(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int max = 0;
		for(int i = 0 ; i <arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			max = Math.max(max, map.get(arr[i]));
		}
		ArrayList<Integer> list = new ArrayList<>();
		for(int key : map.keySet()) {
			if(map.get(key)==max) list.add(key);
		}
		if(list.size()==1) {
			return list.get(0);
		}else {
			Collections.sort(list);
			return list.get(1);
		}
			
		
	}
}
