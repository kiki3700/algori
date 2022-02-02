package impl.sort;

public class Sort {

	public static int[] bubbleSort(int[] arr) {
		/* 인접한 원소부터 마지막 원소까지 반복하여 한단계가 끝나면 가장 큰원소가
		 * 마지막 자리로 정렬
		 * 첫번째 원소부터 인접한 원소 끼리 계속 자리를 교환하면서, 맨 마지막 자리로 이동
		 * 하는 모습이 물속에서 거품이 올라오는 모습 같다고 하여 버블 정렬이라고 한다.
		 */
		final int len = arr.length;
		for(int i = 0; i < len -1 ; i++) {
			for(int j = 0 ; j < len -1 -i; j++) {
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		return arr;
	}
	public static int[] selectSort(int[] arr) {
		/*
		 * for i = 0 to n:
    		a[i]부터 a[n - 1]까지 차례로 비교하여 가장 작은 값이 a[j]에 있다고 하자.
    		a[i]와 a[j]의 값을 서로 맞바꾼다.
    		거품 정렬(bubble sort) : 시간 복잡도 Θ ( n 2 )인 정렬 알고리즘 중에서 선택 정렬은 버블 정렬보다 항상 우수하다.

삽입 정렬(insertion sort) : 삽입 정렬은 k번째 반복 이후, 첫번째 k 요소가 정렬된 순서로 온다는 점에서 유사하다. 하지만 선택 정렬은 k+1 번째 요소를 찾기 위해 나머지 모든 요소들을 탐색하지만 삽입 정렬은 k+1 번째 요소를 배치하는 데 필요한 만큼의 요소만 탐색하기 때문에 훨씬 효율적으로 실행된다는 차이가 있다.

합병 정렬(merge sort) : 선택 정렬은 합병 정렬과 같은 분할 정복 알고리즘을 사용하지만 일반적으로 큰 배열보다 작은 배열(요소 10~20개 미만)에서 더 빠르다. 따라서 충분히 작은 하위 목록에만 삽입 정렬 혹은 선택 정렬을 이용해서 최적화하는 것이 좋다.


		 */
		final int len = arr.length;
		int indexMin, tmp;
		for(int i = 0 ; i < len; i++) {
			indexMin = i;
			for(int j = i; j < len ; j++) {
				if(arr[indexMin] > arr[j]) indexMin = arr[j];
 			}
			tmp = arr[indexMin];
			arr[indexMin]= arr[i];
			arr[i] = tmp;
		}
		return arr;
	}
	static int[] insertSort(int[] arr) {
		/*
		 * 삽입 정렬(揷入整列, insertion sort)은 자료 배열의 모든 요소를 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교하여, 자신의 위치를 찾아 삽입함으로써 정렬을 완성하는 알고리즘이다.
		 * 삽입 정렬은 두 번째 자료부터 시작하여 그 앞(왼쪽)의 자료들과 비교하여 삽입할 위치를 지정한 후 자료를 뒤로 옮기고 지정한 자리에 자료를 삽입하여 정렬하는 알고리즘이다.
즉, 두 번째 자료는 첫 번째 자료, 세 번째 자료는 두 번째와 첫 번째 자료, 네 번째 자료는 세 번째, 두 번째, 첫 번째 자료와 비교한 후 자료가 삽입될 위치를 찾는다. 자료가 삽입될 위치를 찾았다면 그 위치에 자료를 삽입하기 위해 자료를 한 칸씩 뒤로 이동시킨다.
처음 Key 값은 두 번째 자료부터 시작한다.
https://gmlwjd9405.github.io/2018/05/06/algorithm-insertion-sort.html
		 */
		int  key;
		for(int i = 1 ; i < arr.length; i++) {
			key = arr[i];
			int aux = i -1;
			while((aux >= 0 )&& (arr[aux]>key)) {
				arr[aux+1] = arr[aux];
				aux--;
			}
			arr[aux+1] = key;
		}
		return arr;
	}
	static int[] mergeSort(int[] arr,int start, int mid, int end) {
		/*
		 * ‘존 폰 노이만(John von Neumann)’이라는 사람이 제안한 방법
일반적인 방법으로 구현했을 때 이 정렬은 안정 정렬 에 속하며, 분할 정복 알고리즘의 하나 이다.
분할 정복(divide and conquer) 방법
문제를 작은 2개의 문제로 분리하고 각각을 해결한 다음, 결과를 모아서 원래의 문제를 해결하는 전략이다.
분할 정복 방법은 대개 순환 호출을 이용하여 구현한다.
과정 설명
리스트의 길이가 0 또는 1이면 이미 정렬된 것으로 본다. 그렇지 않은 경우에는
정렬되지 않은 리스트를 절반으로 잘라 비슷한 크기의 두 부분 리스트로 나눈다.
각 부분 리스트를 재귀적으로 합병 정렬을 이용해 정렬한다.
두 부분 리스트를 다시 하나의 정렬된 리스트로 합병한다.
하나의 리스트를 두 개의 균등한 크기로 분할하고 분할된 부분 리스트를 정렬한 다음, 두 개의 정렬된 부분 리스트를 합하여 전체가 정렬된 리스트가 되게 하는 방법이다.
합병 정렬은 다음의 단계들로 이루어진다.
분할(Divide): 입력 배열을 같은 크기의 2개의 부분 배열로 분할한다.
정복(Conquer): 부분 배열을 정렬한다. 부분 배열의 크기가 충분히 작지 않으면 순환 호출 을 이용하여 다시 분할 정복 방법을 적용한다.
결합(Combine): 정렬된 부분 배열들을 하나의 배열에 합병한다.
합병 정렬의 과정
추가적인 리스트가 필요하다.
각 부분 배열을 정렬할 때도 합병 정렬을 순환적으로 호출하여 적용한다.
합병 정렬에서 실제로 정렬이 이루어지는 시점은 2개의 리스트를 합병(merge)하는 단계 이다.

https://gmlwjd9405.github.io/2018/05/08/algorithm-merge-sort.html
https://gmlwjd9405.github.io/2018/05/08/algorithm-merge-sort.html
		 */
	}
}
