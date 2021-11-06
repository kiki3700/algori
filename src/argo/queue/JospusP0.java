package argo.queue;
import java.util.*;
public class JospusP0 {
    public static void main(String[] args){
        LinkedList<Integer> ans = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for(int i =1; i<=n; i++){
            list.add(i);
        }
        
        for(int j = 0 ; j <n; j++){
            for(int i = 0; i<k; i++){
                int tmp = list.pollFirst();
                if(i!=k-1){
                list.addLast(tmp);
                }else{
                    ans.addLast(tmp);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        
        for(int i = 0; i<ans.size(); i++){
            sb.append(ans.get(i)+", ");
      
        }
        sb.deleteCharAt(sb.length()-1);
        sb.deleteCharAt(sb.length()-1);
        sb.append(">");
        System.out.println(sb.toString());
    }
}