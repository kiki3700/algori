package argo.list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class AC {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		loop1 : for(int i = 0 ; i < n ; i++) {
			String orders =br.readLine();
			boolean reverse = false;
			br.readLine();
			LinkedList<Integer> list = parseStringToList(br.readLine());
			for(int j = 0 ; j < orders.length();j++) {

				char order = orders.charAt(j);
				if(order=='R') {
					
					reverse = !reverse;
				}else {
					if(list.isEmpty()) {
						sb.append("error\n");
						continue loop1;
					}
					list = delete(list, reverse);
				}
			}
			sb.append(parseListToString(list,reverse)+"\n");
		}
		System.out.println(sb.toString());
	}
	static LinkedList<Integer> delete(LinkedList<Integer> list, boolean reverse) {
		if(!reverse) {
			list.pollFirst();
		}else {
			list.pollLast();
		}
		return list;
	}
	
	static LinkedList<Integer> parseStringToList(String str){
		LinkedList<Integer> list = new LinkedList<>();
		str= str.replace("[", "");
		str = str.replace("]", "");
		StringTokenizer st = new StringTokenizer(str, ",");
		while(st.hasMoreTokens()) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		return list;
	}
	static String parseListToString(LinkedList<Integer> list, boolean reverse) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		while(list.size()>0) {
			if(!reverse) {
				sb.append(list.pollFirst());
			}else {
				sb.append(list.pollLast());
			}
			if(list.size()>0) sb.append(",");
		}
		sb.append("]");
		return sb.toString();
	}
}
