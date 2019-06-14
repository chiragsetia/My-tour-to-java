public class Solution {

/*	Binary Tree Node class 
 * 
 * 	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	*/
	
	public static void printNodeFromK1ToK2(BinaryTreeNode<Integer> root,int k1,int k2){
		if(root==null){
            return;
        }
        if(root.data>k2)
        	printNodeFromK1ToK2(root.left,k1,k2);
        else if(root.data<k1)
        	printNodeFromK1ToK2(root.right,k1,k2);
        else{
        	System.out.print(root.data+" ");
        	printNodeFromK1ToK2(root.left,k1,root.data);
        	printNodeFromK1ToK2(root.right,root.data,k2);
        }
	}
	public static boolean isBST(BinaryTreeNode<Integer> root) {
        return isBST(root,Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
    private static boolean isBST(BinaryTreeNode<Integer> root, int min,int max){
    	if(root==null){
    		return true;
    	}
    	if(root.data<min||root.data>max){
    		return false;
    	}
    	return isBST(root.left,min,root.data)&& isBST(root.right, root.data, max);
    } 


// Code: BST to Sorted LL
// Send Feedback
// Given a BST, convert it into a sorted linked list. Return the head of LL.
  /*  class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;
	
	public LinkedListNode(T data) {
		this.data = data;
	}
}
*/
	public static LinkedListNode<Integer> BSTToSortedLL(BinaryTreeNode<Integer> root){
        if(root==null){
            return null;
        }
        LinkedListNode<Integer> head=BSTToSortedLL(root.left);
        if(head==null){
        	head=new LinkedListNode<>(root.data);
        	head.next=BSTToSortedLL(root.right);
        }else{
        	LinkedListNode<Integer> newHead=head;
        	while(newHead.next!=null){
        		newHead=newHead.next;
        	}
        	newHead.next=new LinkedListNode<>(root.data);
        	newHead.next.next=BSTToSortedLL(root.right);
        }
        return head;
// 	}
// 	Create & Insert Duplicate Node
// Given a Binary Tree with N number of nodes, for each node create a new duplicate node, 
        //and insert that duplicate as left child of the original node.

	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
        if(root==null){
            return;
        }
        BinaryTreeNode<Integer> rootL=new BinaryTreeNode<>(root.data);
        insertDuplicateNode(root.left);
        insertDuplicateNode(root.right);
        BinaryTreeNode<Integer> l=root.left;
        root.left=rootL;
        rootL.left=l;
	}

//LCA of Binary Tree

	public static int lcaBinaryTree(BinaryTreeNode <Integer> root , int a, int b){
        if(root==null){
            return -1;
        }
        if(root.data==a)
            return a;
        if(root.data==b){
            return b;
        }
        int l=lcaBinaryTree(root.left,a,b);
        int r=lcaBinaryTree(root.right,a,b);
        if(l==-1)
        	return r;
        if(r==-1)
        	return l;
        return root.data;

	}
}
