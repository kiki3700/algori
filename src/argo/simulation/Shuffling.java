package argo.simulation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;
public class Shuffling {
	static BufferedReader br;
	static int[] card;
	static int[] order;
	static HashSet<String> set;
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		set = new HashSet<>();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		card = new int[n];
		for(int i =  0; i < n ;i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		order = new int[n];
		for(int i =  0; i < n ;i++) {
			order[i] = Integer.parseInt(st.nextToken());
		}
		br.close();
		int idx = 0;
		while(!check()) {
			String str = Arrays.toString(card);
			if(set.contains(str)) {
				idx = -1;
				break;
			}
			set.add(str);
			shuffle();
			idx++;
		}
		System.out.println(idx);
	}
	static void shuffle() {
		int len = card.length;
		int[] arr= new int[len];
		for(int i = 0; i < len ; i++) {
			arr[order[i]] = card[i];
		}
		card = arr;
	}
	static boolean check() {
		int len = card.length;
		
		for(int i = 0; i<len; i++) {
			if(card[i] != i-(i/3)*3) {
				return false;
			}
		}
		return true;
	}
}
