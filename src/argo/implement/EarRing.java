package argo.implement;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
public class EarRing {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int cnt = 1;
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) break;
			HashMap<Integer, String> nameMap = new HashMap<>();
			HashMap<Integer, Integer> earMap = new HashMap<>();
			for(int i = 1; i <=n ; i++) {
				nameMap.put(i, br.readLine());
				earMap.put(i,0);
			}
			for(int i = 0 ; i<2*n-1;i++) {
				String str = br.readLine();
				int who =Integer.parseInt(str.charAt(0)+"");
				earMap.put(who, earMap.get(who)+1);
			}
			for(int key : earMap.keySet()) {
				if(earMap.get(key)==1) {
					String name = nameMap.get(key);
					sb.append(cnt+" "+name+"\n");
					break;
				}
			}
			cnt++;
		}
		System.out.print(sb);
	}
}
