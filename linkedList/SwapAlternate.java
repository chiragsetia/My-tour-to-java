/*
Given a singly linked list of size N. The task is to swap elements pairwise.

Input:
First line of input contains number of testcases T. For each testcase, first line of input contains length of linked list and
next line contains linked list data.

Output:
Output the linked list after swapping pairwise nodes.

User Task:
The task is to complete the function pairWiseSwap() which takes head reference as the only argument and returns nothing.

Constraints:
1 <= T <= 100
1 <= N <= 103

Example:
Input:
1
8
1 2 2 4 5 6 7 8

Output:
2 1 4 2 6 5 8 7

Explanation:
Testcase 1: After swapping each pair considering (1,2), (2, 4), (5, 6).. so on as pairs, we get 2, 1, 4, 2, 6, 5, 8, 7 as new linked list.*/

/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
// complete the below function
class GfG
{
    public static void pairwiseSwap(Node node)
    {
        if(node==null||node.next==null){
            return;
        }
        Node head=node;
       while(head!=null&&head.next!=null){
           int temp=head.data;
           head.data=head.next.data;
           head.next.data=temp;
           head=head.next.next;
       }
       
    }
    
   
}
