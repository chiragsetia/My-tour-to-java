/*
Implement a Queue using 2 stacks s1 and s2 .

Input Format:
The first line of the input contains an integer 'T' denoting the number of test cases. Then T test cases follow.
First line of each test case contains an integer Q denoting the number of queries . 
A Query Q is of 2 Types
(i) 1 x (a query of this type means  pushing 'x' into the queue)
(ii) 2   (a query of this type means to pop element from queue and print the poped element)
The second line of each test case contains Q queries seperated by space.
*/


class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    /* The method insert to push element
       into the queue */
    void insert(int B)
    {
        s1.push(B);
    }
	
    
    /* The method remove which return the
      element popped out of the queue*/
    int remove()
    {
	   if(s1.isEmpty())
	    return -1;
	   while(!s1.isEmpty()){
	       s2.push(s1.pop());
	   }
	   int n=s2.pop();
	   while(!s2.isEmpty()){
	       s1.push(s2.pop());
	   }
    return n;
        
    }
    
}
