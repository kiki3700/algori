package argo.geo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;
class Building{
	int ind;
	double hight;
	int total;
	Building(int ind, double hight){
		this.ind = ind;
		this.hight = hight;
		this.total = 0;
	}
}

public class HighRiseBuilding {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Building[] bArr = new Building[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < n ; i++) {
			double hight = Double.parseDouble(st.nextToken());
			bArr[i] = new Building(i, hight);
		}
		
		for(int i = 0 ; i <n-1; i++) {
			Double pre = null;
			for(int j = i+1; j<n ; j++) {
				double g =getGradient(bArr[i],bArr[j]);
				if(pre ==null) pre =g-1;
				if(g>pre) {;
					bArr[i].total++;
					bArr[j].total++;
				}
//				System.out.println(i+","+j+" : "+g);
				pre= Math.max(g, pre);
			}
		}
		int max = 0;
		for(int i = 0; i < n ;i++) {
//			System.out.println(i+"th "+bArr[i].total);
			max=Math.max(max, bArr[i].total);
		}
		System.out.println(max);
	}
	
	static double getGradient(Building a , Building b) {
		return (b.hight-a.hight)/(b.ind-a.ind);
	}
}
