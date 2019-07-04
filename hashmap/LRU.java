/*
The task is to design and implement methods of an LRU cache. The class has two methods get() and set() which are defined as follows.
get(x)   : Returns the value of the key x if the key exists in the cache otherwise returns -1.
set(x,y) : inserts the value if the key x is not already present. If the cache reaches its capacity it should invalidate the least recently used item before inserting the new item.
In the constructor of the class the size of the cache should be intitialized.

Input Format:
The first line of input contain an integer T denoting the number of test cases. Then T test case follow. Each test case contains 3 lines. The first line of input contains an integer N denoting the capacity of the cache and then in the next line is an integer Q denoting the number of queries Then Q queries follow. A Query can be of two types
1. SET x y : sets the value of the key x with value y
2. GET x : gets the key of x if present else returns -1.
*/

class LRUCache {
 
   Map<Integer,Integer> map;
    int capacity;
    Queue<Integer> q;
    /*Inititalize an LRU cache with size N */
    public LRUCache(int N) {
        map=new HashMap<>();
        capacity=N;
        q=new LinkedList<>();
    }
    
    /*Returns the value of the key x if 
     present else returns -1 */
    public int get(int x) {
       if(map.containsKey(x)){
           Queue<Integer> q1=new LinkedList<>();
            while(!q.isEmpty()){
                int t=q.remove();
                if(t!=x){
                    q1.add(t);
                }
            }
            q1.add(x);
            q=q1;
           return map.get(x);
       }else{
           return -1;
       }
    }
    
    /*Sets the key x with value y in the LRU cache */
    public void set(int x, int y) {
        if(capacity==0&&!map.containsKey(x)){
            map.remove(q.remove());
            q.add(x);
            map.put(x,y);
            //System.out.println(q);
        }else if(!map.containsKey(x)){
            map.put(x,y);
            capacity--;
            q.add(x);
        }else{
            map.put(x,y);
            Queue<Integer> q1=new LinkedList<>();
            while(!q.isEmpty()){
                int t=q.remove();
                if(t!=x){
                    q1.add(t);
                }
            }
            q1.add(x);
            q=q1;
        }
    }
}
