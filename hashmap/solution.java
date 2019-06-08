/*This problem was asked in CureFit.
Problem
You are given an array of N integers. Each integer represents height of a balloon. So, there are N balloons lined up.
Your aim is to destroy all these balloons. Now, a balloon can only be destroyed if player shoots its head. So, to do the needful, he/ she shoots an arrow from the left to the right side of the platform, from an arbitrary height he/she chooses. The arrow moves from left to right, at a chosen height H until it finds a balloon. The moment when an arrow touches a balloon, the balloon gets destroyed and disappears and the arrow continues its way from left to right at a height decreased by 1. Therefore, if the arrow was moving at height H, after destroying the balloon it travels on height H-1. The player wins this game, if he destroys all the balloons in minimum arrows.
You have to print the minimum arrows required to complete the task.*/

import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;

public class Main {

	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        hits(sc);
	}
   private static void hits(Scanner sc){
        int n=sc.nextInt();
        // int cf=0;
        // int v=0;
        HashMap<Integer,Integer> map=new HashMap<>();
       // HashMap<Integer, Integer> mapC=new HashMap<>();
        for(int i=0;i<n;i++){
            //System.out.println(map+" "+mapC);
            int t=sc.nextInt();
            if(map.containsKey(t)){
                map.put(t,map.get(t)+1);

            }else{
                map.put(t,1);
            }
             if(map.containsKey(t+1)){
                    map.put(t+1,map.get(t+1)-1);
                    if(map.get(t+1)==0){
                        map.remove(t+1);
                    }
                }
            // if(map.containsKey(t)){
            //     if(map.containsKey(t-1))
            //         map.put(t-1,map.get(t-1)+map.get(t));
            //     else
            //         map.put(t-1,map.get(t));
            //     if(mapC.containsKey(t+1)){
            //         mapC.put(t+1,mapC.get(t+1)-1);
            //         if(mapC.get(t+1)==0){
            //             mapC.remove(t+1);
            //             mapC.put(t,0);
            //         }
                
            //         }
            //     map.remove(t);
            // }else if(map.containsKey(t-1)){
            //     if(mapC.containsKey(t)){
            //        map.put(t-1,map.get(t-1)+1);
            //        mapC.put(t,mapC.get(t)+1);
            //     }
            // }else{
            //     mapC.put(t,1);
            //     map.put(t-1,1);
            // }
           // System.out.println(map);
        }
        int c=0;
        Set<Integer> set=map.keySet();
        for(Integer i:set ){
            c+=map.get(i);
        }
        System.out.println(c);
     }

}
