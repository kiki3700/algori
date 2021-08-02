package argo.binarySearch;
import java.util.*;

public class NumCard2 {
	static int n;
	static int[] arr;
	static int m;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		for(int i = 0 ; i < n; i++) {
			arr[i]= sc.nextInt();
		}
		Arrays.sort(arr);
		
		
	}
	static int binarySearchEnd(int target, int start, int end) {
		if(start> end ) return -1;
		int mid = (start+end)/2;
		if(end<n-1) {
			if(arr[mid]==target && target!=arr[mid+1]) {
				return mid;
			}else {
				if(arr[mid]>target) {
					return binarySearchEnd(target, start, mid-1);
				}else {
					return binarySearchEnd(target, mid+1,end);
				}
			}
		}else {
			if(arr[mid]==target) {
				return mid;
			}else {
				return -1;
			}
		}

	}
	
	static int binarySearchStart(int target, int start, int end) {
		if(start> end ) return -1;
		int mid = (start+end)/2;
		if(n-1) {
			if(arr[mid]==target && target!=arr[mid+1]) {
				return mid;
			}else {
				if(arr[mid]>target) {
					return binarySearchEnd(target, start, mid-1);
				}else {
					return binarySearchEnd(target, mid+1,end);
				}
			}
		}else {
			if(arr[mid]==target) {
				return mid;
			}else {
				return -1;
			}
		}

	}
}

