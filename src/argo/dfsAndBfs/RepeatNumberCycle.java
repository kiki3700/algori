package argo.dfsAndBfs;
import java.util.*;
public class RepeatNumberCycle {

    static int base;
    static int power;
    static int count;
    static HashMap<Integer, Integer> mem;
    static ArrayList<Integer> a;
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        base = sc.nextInt();
        power = sc.nextInt();
        mem = new HashMap<>();
        a = new ArrayList<>();
        count = 0;
        a.add(base);
        mem.put(base,1);
            cal();


        System.out.print(a.indexOf(base));
    }
    static void cal(){
    	int tmp = base;
    	int sum =0;

    	while(true) {
    		sum += (int) Math.pow(tmp%10, power);
    		tmp = tmp/10;
    		if(tmp/10==0) {
    			sum += (int) Math.pow(tmp, power);
    			break;
    		}
    	}
    	base = sum;
        while(!mem.containsKey(base)){

            mem.put(base,1);
            a.add(base);
        
        cal();

        }
    }
}