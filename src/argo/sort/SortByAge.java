package argo.sort;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class User {
    int age;
    String name;
    public  User(int age, String name){
        this.age = age;
        this.name = name;
    }
    
	
}
public class SortByAge {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        User[] arr = new User[n];
        for(int i = 0; i< n; i++){
            arr[i] = new User(sc.nextInt(), sc.next());
        }
        Arrays.sort(arr, new Comparator<User>(){
        	@Override
        	public int compare(User o1, User o2) {
        		return o1.age-o2.age;
        	}
        });
        for(int i = 0 ; i<n; i++){
            System.out.println(arr[i].age+" "+arr[i].name);
        }
    }
    
   
}