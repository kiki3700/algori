package argo.implement;
import java.math.BigInteger;
import java.util.*;
import java.io.*;
public class Sign {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        BigInteger zero = new BigInteger("0");
        for(int i = 0; i < 3; i++) {
            n = Integer.parseInt(br.readLine());
            BigInteger s = zero;
            for(int j = 0; j < n; j++) {
                BigInteger now = new BigInteger(br.readLine());
                s = s.add(now);
            }
            if(s.compareTo(zero) == 0) {     
                System.out.println(0);
            }else if(s.compareTo(zero) == 1) {  
                System.out.println("+");
            }else {                            
                System.out.println("-");
            }
        }
 
    }
 
}
 
