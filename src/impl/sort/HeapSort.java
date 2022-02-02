package impl.sort;

public class HeapSort {
	public void heapSort(int[] arr) {
		int n = arr.length;
        // maxHeap을 구성
        // n/2-1 : 부모노드의 인덱스를 기준으로 왼쪽(i*2+1) 오른쪽(i*2+2)
        // 즉 자식노드를 갖는 노트의 최대 개수부터
		for(int i = n /2-1; i >= 0; i--) {
			heapify(arr, n,i);
		}
		for(int i = n -1 ; i > 0 ; i--) {
			swap(arr, 0, i);
			heapify(arr, i , 0);
		}
	}
	
	private void heapify(int[] arr, int n , int i) {
		int p = i;
		int l = i*2 +1;
		int r = i * 2+2;
		if(l < n && arr[p] < arr[l]) {
			p = l;
		}
		if(r < n && arr[p] <arr[r]) {
			p = r;
		}
		if(i != p) {
			swap(arr, p , i);
			heapify(arr, n,p);
		}
		
	}
	private void swap(int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}
}
