package argo;
import java.math.BigInteger;
import java.util.*;
public class GreatRich {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger m = sc.nextBigInteger();
        System.out.println(n.divide(m));
        System.out.print(n.remainder(m));
    }
}