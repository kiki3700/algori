package argo.queue;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;
public class Stack1 {


    static Stack<Integer> list;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws NumberFormatException, IOException{
        Scanner sc = new Scanner(System.in);
        
        list = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i< n ; i++){
            check(br.readLine());
        }
        br.close();
        bw.flush();
        
    }
    
    
    
    
    static void check(String str)throws IOException{
        int var = 0;
        if(str.contains("push")){
             String[] a = str.split(" ");
            var = Integer.parseInt(a[1]);
            str = a[0];
        }
        switch(str){
            case "push":
                push(var);
                break;
            case "pop":
                pop();
                break;
            case "top":
                top();
                break;
            case "empty":
                empty();
                break;
            case "size":
                size();
                break;
        }
    }
    
    static void push(int Num){
        list.add(Num);
    }
    static void pop() throws IOException{
        if(list.isEmpty()){
            bw.write("-1\n");
        }else{
            bw.write(list.pop()+"\n");
        }
    }
    static void top() throws IOException{
        if(list.isEmpty()){
            bw.write(-1+"\n");
        }else{
            bw.write(list.peek()+"\n");
        }
    }
    static void empty()throws IOException{
        if(list.isEmpty()){
             bw.write(1+"\n");
        }else{
             bw.write(0+"\n");
        }
    }
    static void size()throws IOException{
        bw.write(list.size()+"\n");
    }
}