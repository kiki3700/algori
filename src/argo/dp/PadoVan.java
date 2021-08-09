package argo.dp;
import java.util.*;
public class PadoVan {
	static int n;
    static int max;
    static long[] arr;
    static long[] series;
    static StringBuilder sb;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr =new long[n];
        max = 0;
        for(int i = 0; i < n ; i++){
            int tmp = sc.nextInt();
            arr[i] = tmp;
            if(max<tmp) max = tmp;
        }
        series = new long[max];
        padovan();
        sb = new StringBuilder();
        for(int i = 0; i<n;i++){
            sb.append(series[(int) (arr[i]-1)]+"\n");
        }
        System.out.print(sb);
    }
    static void padovan(){
        for(int i =0; i < series.length; i++){
            if(i<3){
                series[i]=1;
            }else{
                series[i]= series[i-2]+series[i-3];
            }
        }
    }
}
