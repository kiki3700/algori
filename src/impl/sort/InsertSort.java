package impl.sort;

public class InsertSort {
	public void sort(int[] data) {
		for(int which = 1 ; which < data.length ; ++which) {
			int val  = data[which];
			for(int i = which -1; i >=0 ; --i) {
				if(val < data[i]) {
					data[i +1] = data[i];
					data[i] = val;
				}else {
					break;
				}
			}
		}
	}
}
