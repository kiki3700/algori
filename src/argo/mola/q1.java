package argo.mola;

import java.util.*;

public class q1 {
	static PriorityQueue<Integer> heap;
	static HashMap<Integer, Integer[]> map;
	static boolean[] visit;
	public static void main(String[] args) {
		int[] arr = {1,3,5,7,9};
	}
	//calculate form len 1 to len =len/2-1
	static void makeCombination(int[] arr, int index) {
		if(index>= arr.length/2) return;
		int[] a = new int[index];
		int[] b = new int[arr.length-index];
		
		int length = (int)(Math.log10(2)+1);
	}
	static int sortAndMake(int[] arr) {
		Arrays.sort(arr);
		int sum;
		for(int i = 0 ; i< arr.length;i++) {
			sum += arr[i];
			if(i!=arr.length-1) sum*=10; 
		}
	}
