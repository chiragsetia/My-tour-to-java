/*
Given two binary trees, the task is to find if both of them are identical or not. 

Input:
The task is to complete the method isIdentical(), which takes 2 argument, the roots r1 and r2 of the Binary Trees. The struct Node has a data part which stores the data, pointer to left child and pointer to right child.
There are multiple test cases. For each test case, this method will be called individually.

Output:
The function should return true if both trees are identical else false.

class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Tree
{
	/* Should return true if trees with roots as root1 and 
   root2 are identical else false */
        boolean isIdentical(Node root1, Node root2)
	{
		if(root1==null&&root2==null){
		    return true;
		}else if((root1!=null&&root2==null)||(root1==null&&root2!=null)){
		    return false;
		}
		return(root1.data==root2.data&&isIdentical(root1.left,root2.left)&&isIdentical(root1.right,root2.right));
	}
	
}
