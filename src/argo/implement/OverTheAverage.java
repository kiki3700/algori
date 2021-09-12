package argo.implement;
import java.text.DecimalFormat;
import java.util.*;
public class OverTheAverage {
    static int n;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        DecimalFormat df = new DecimalFormat("###.000");
        n = sc.nextInt();
        for(int i = 0; i< n ; i++){
            int stuNum = sc.nextInt();
            int[] stuArr = new int[stuNum];
            int sum = 0;
            for(int j = 0; j < stuNum ; j++){
                int tmp = sc.nextInt();
                stuArr[j]= tmp;
                sum += tmp;
            }
            double avr = sum/(double)stuNum;
//            System.out.println("average is "+ avr);
            int cnt = 0;
            for(int j = 0; j < stuNum ; j++){
                if((float)stuArr[j]>avr) cnt++;
            }
//            System.out.println("cnt is "+cnt);
            double prob = cnt/(double)stuNum;
//            String ans = df.format(prob/1000);
////            System.out.println("prob is "+prob/1000);
//            sb.append(ans+"%\n");
            System.out.printf("%.3f", 100*prob);
            System.out.println("%");
        }

    }
}//with double it solved 