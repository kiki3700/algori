package argo.sort;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
public class SortCoordinate2 {
	static BufferedReader br;
	static BufferedWriter bw;
	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Cord[] arr = new Cord[n];
		for(int i = 0; i<n; i++) {
			StringTokenizer token = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(token.nextToken());
			int y = Integer.parseInt(token.nextToken());
			arr[i] = new Cord(x, y);
		}
		Arrays.sort(arr, new Comparator<Cord>() {
			@Override
			public int compare(Cord o1, Cord o2) {
				// TODO Auto-generated method stub
				if(o1.y== o2.y) {
					return o1.x - o2.x;
					}
				return o1.y- o2.y;
				};
			});
		for(int i = 0; i<n ;i++) {
			bw.write(arr[i].toString()+"\n");
			}
		br.close();
		bw.flush();
		}
	
	
}
class Cord{
	int x;
	int y;
	public Cord(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return this.x+" "+this.y;
	}
}