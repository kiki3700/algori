package argo.class1;
import java.util.*;
public class NumberOfWord {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        if(str.isEmpty()) {
        	System.out.print(0);
        }else {
            String[] strArr = str.split(" ");
            System.out.print(strArr.length);
        }

    }
}