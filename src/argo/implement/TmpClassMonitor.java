package argo.implement;
import java.util.*;
public class TmpClassMonitor {
    static int n;
    static int[] arr;
    static int[][] grades;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        grades = new int[n][5];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 5; j++){
                grades[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        int ind = -1;
        for(int i = 0 ; i < n; i++){
        	Set<Integer> set = new HashSet<>();
            for(int j = 0 ; j < 5; j++){
                for(int x = 0; x < n ;x ++){

                        if(grades[i][j]==grades[x][j] && x !=i) {
                        	set.add(x);
                        }
                    
                }
                if(max < set.size()) {
                	max = set.size();
                	ind = i;
                }
            }
        }



        System.out.print(ind+1);
    }
}