package argo.HashMap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class PocketmonMaster {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st =new StringTokenizer(br.readLine());
		int row = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		HashMap<Integer,String> intMap = new HashMap<>();
		HashMap<String, Integer> strMap = new HashMap<>();
		for(int i = 0; i<row; i++) {
			String mon = br.readLine();			
			intMap.put(i+1, mon);
			strMap.put(mon, i+1);
		}
		for(int i = 0 ; i<n; i++) {
			String str = br.readLine();
			char fc =  str.charAt(0);
			if((fc-'0')<=9) {
				int key = Integer.parseInt(str);
				bw.write(intMap.get(key)+"\n");
			}else {
				bw.write(strMap.get(str)+"\n");
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
