package argo.implement;
import java.util.*;
public class Zero {
    static Stack<Integer> st;
    static int n;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        st = new Stack<>();
        for(int i = 0 ; i < n ; i++){
            int tmp = sc.nextInt();
            if(tmp==0&&!st.isEmpty()){
                st.pop();
            }else{
                st.push(tmp);
            }
        }
        long sum=0;
        while(!st.isEmpty()){
            sum += st.pop();
        }
        System.out.print(sum);
    }
}