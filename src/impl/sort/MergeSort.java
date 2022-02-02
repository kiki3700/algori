package impl.sort;

public class MergeSort {
	static int[] tmp;
	public static void sort(int[] arr) {
		tmp = new int[arr.length];
		sort(arr, 0, arr.length-1);
	}
	public static void sort(int[] arr, int start, int end) {
		if(start < end) {
			int mid = (start + end)/2;
			sort(arr, start, mid);
			sort(arr , mid + 1, end);
			merge(arr, start, mid, end);
		}
	}
	public static void merge(int[] arr , int start, int mid, int end) {
		tmp = arr.clone();
		int leftIdx = start;
		int rightIdx = mid +1;
		int idx = start;
		while(leftIdx <= mid && rightIdx <= end) {
			if(tmp[leftIdx] <= tmp[rightIdx]) {
				arr[idx++] = tmp[leftIdx++];
			}else {
				arr[idx++] = tmp[rightIdx++];
			}
		}
		
		for(int i = 0 ; i <= mid-leftIdx; i++) {
			arr[idx+1] = tmp[leftIdx+i];
		}
	}

}
