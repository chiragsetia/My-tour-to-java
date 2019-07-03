/*
Given a Linked List of size N, where every node represents a linked list and contains two pointers of its type:
(i) a next pointer to the next node,
(ii) a bottom pointer to a linked list where this node is head.

You have to flatten the linked list to a single linked list which is sorted.

       5 -> 10 -> 19 -> 28
       |    |     |     |
       V    V     V     V
       7    20    22    35
       |          |     |
       V          V     V
       8          50    40
       |                |
       V                V
       30               45
and after flattening it, the sorted linked list looks like:

 5-> 7-> 8- > 10 -> 19-> 20-> 22-> 28-> 30-> 35-> 40-> 45-> 50.

The  node structure has 3 fields as mentioned. A next pointer, a bottom pointer and a data part.
There are multiple test cases. For each test case, this function will be called individually.

Input (To be used for Expected Output):
The first line of the input contains an integer 'T' denoting the number of test cases. Then T test cases follow.
First line of each test case contains an integer N denoting the number of head nodes connected to each other.
Second line of each test case contains N space separated numbers (M1, M2...Mn) denoting number of elements in 
linked lists starting with each head. Third line of each test case contains all the elements of the linked list 
starting with 1st head node and covering all the elements through its down pointer, then 2nd head node and 
covering all its elements through down pointer and so on till the last head node of the linked list.
*/


class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}
*/
/*  Function which returns the  root of 
    the flattened linked list. */
class GfG
{
    Node flatten(Node root)
    {
     Node head=root.next;
     while(head!=null){
        //System.out.println("1");
        Node head1=root;
         while(head1.bottom!=null&&head1.bottom.data<head.data){
             head1=head1.bottom;
             //System.out.println("2");
         }
         //System.out.println(head1.bottom.data);
         Node newBottom=head1.bottom;
         head1.bottom=head;
         //System.out.println(head1.bottom.data);
         while(newBottom!=null){
             if(head1.bottom==null){
                 head1.bottom=newBottom;
           //      System.out.println("3");
                 break;
             }else if(head1.bottom.data>newBottom.data){
                 Node temp=head1.bottom;
                 head1.bottom=newBottom;
                 newBottom=newBottom.bottom;
                 head1.bottom.bottom=temp;
                 head1=head1.bottom;
             }else{
             //    System.out.println("4");
                 head1=head1.bottom;
             }
         }
         head=head.next;
     }
     if(root.bottom!=null&&root.data>root.bottom.data)
     {
         Node troot=root;
         root=root.bottom;
         head=root;
         while(head.bottom!=null&&troot.data>head.bottom.data){
             head=head.bottom;
         }
         Node temp=head.bottom;
         head.bottom=troot;
         troot.bottom=temp;
     }
     return root;
    }
}
