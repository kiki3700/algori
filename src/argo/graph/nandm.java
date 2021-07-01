package argo.graph;

import java.util.*;

public class nandm{
  static TreeSet<String> tree; 
  static StringBuilder sb;
  static HashSet<Integer> set;
  public static void main(String[] args){
      sb= new StringBuilder();
      Scanner sc = new Scanner(System.in);
      tree = new TreeSet<> ();
      int n = sc.nextInt();
      int m = sc.nextInt();

      set = new HashSet();
      int[] nums = new int[n];
      for(int i=0; i<n;i++){

          nums[i]=i+1;
      }
      
      int[] a = new int[m];
      tree.add(continousNum(nums,set, 0, 0, n,m,a));
      
      for(String s : tree){
           sb.append(s+"\n");
          System.out.println(sb);
      }
      
  }
  static String continousNum(int[] nums, HashSet set,int index,int len, int n, int m, int[] a){
	  System.out.println(index);
      if(len==m) {
          String s= new String();
         for(int i=0;i<m ;i++){
          s= a[i]+"";
          if(i<m) s+="\s";
          }
         System.out.println(s);
                return s;
      }
      if(index>=n-1) continousNum(nums,set, 0,len+1,n,m,a);
      if(set.contains(nums[index])) continousNum(nums, set, index+1, len, n, m, a);
      a[len]= nums[index];
      set.add(nums[index]);
      System.out.print(a[len]);
      continousNum(nums, set, 0,len+1, n, m, a);
      set.clear();
      return "";
  }
}