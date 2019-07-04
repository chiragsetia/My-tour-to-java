/*
Implement a Stack using two queues q1 and q2.

Input Format:
The first line of the input contains an integer 'T' denoting the number of test cases. Then T test cases follow.
First line of each test case contains an integer Q denoting the number of queries . 
A Query Q is of 2 Types
(i) 1 x   (a query of this type means  pushing 'x' into the stack)
(ii) 2     (a query of this type means to pop element from stack and print the poped element)
The second line of each test case contains Q queries seperated by space.*/

class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    /*The method pop which return the element poped out of the stack*/
    int pop()
    {
        if(q1.isEmpty()){
            return -1;
        }
        while(q1.size()!=1){
            q2.add(q1.remove());
        }
        int n=q1.remove();
        q1=q2;
        q2=new LinkedList<Integer>();
        return n;
    }
	
    /* The method push to push element into the stack */
    void push(int a)
    {
        q1.add(a);
    }
}
