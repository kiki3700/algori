package argo.sort;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;


public class SortCoordinate {
	static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		Coord[] arr = new Coord[n];
		for(int i = 0 ; i <n ; i++) {
			String[] str = br.readLine().split(" ");
			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[1]);
			
			Coord a = new Coord(x, y);
			arr[i] = a;
		}
		Arrays.sort(arr, new Comparator<Coord>() {
			@Override
			public int compare(Coord o1, Coord o2) {
				// TODO Auto-generated method stub
				if(o1.x==o2.x) {
					return o1.y-o2.y;
				}else {
					return o1.x-o2.x;
				}
			}
		});
		for(int i = 0 ; i < n; i++) {
			bw.write(arr[i].toString()+"\n");
		}
		br.close();
		bw.flush();
	}
}
class Coord{
	int x;
	int y;
	public Coord(int x , int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return this.x+" "+this.y;
	}
	
}