package impl.sort;

public class QuickSort {
	public void sort(int[] data) {
		if(data.length < 2) {
			return;
		}
		int pivotIndex = data.length/2;
		int pivotValue = data[pivotIndex];
		
		int leftCount = 0 ; 
		for( int i = 0 ; i < data.length; i++) {
			if(data[i]<pivotValue) leftCount++;
		}
		
		int[] left = new int[leftCount];
		int[] right = new int[data.length-leftCount-1];
		int l = 0;
		int r = 0;
		for(int i = 0 ; i < data.length ; i++) {
			if(i == pivotIndex) continue;
			int val = data[i];
			
			if(val<pivotValue) {
				left[l++] = val;
			}else {
				right[r++] = val;
			}
		}
		sort(left);
		sort(right);
		System.arraycopy(left, 0, data, 0, left.length);
		data[left.length] = pivotValue;
		System.arraycopy(right, left.length+1, data, left.length+1, right.length);		
	}
}
