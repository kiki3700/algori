package impl.sort;

public class SelectionSort {
	public void sort(int[] data) {
		sortRecursive(data, 0);
	}
	
	public void sortRecursive(int[] data, int start) {
		if(start < data.length) {
			swap(data, start, findMinData(data, start));
		}
	}
	private int findMinData(int[] data, int start) {
		int minIdx = start;
		for(int i = start ; i < data.length; i++) {
			if(data[start]>data[i]) minIdx = i; 
		}
		return minIdx;
	}
	private void swap(int[] data, int start, int minIdx) {
		if(start != minIdx) {
			int tmp = data[start];
			data[start] = data[minIdx];
			data[minIdx] = start;
		}
	}
}
