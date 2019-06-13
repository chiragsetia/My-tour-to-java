/*Maximum Leave Path
Level HARD
Given a binary tree of N nodes, find and return the maximum sum path between two leaves of the given tree.
Given binary tree contains positive values only.*/

public class Solution {

/*	Binary Tree Node class
 * 
 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	*/
    
	public static pair helper(BinaryTreeNode<Integer> root){
        if(root==null){
            return new pair(0L,0L,0L);
        }
        pair l=helper(root.left);
        pair r=helper(root.right);
        return new pair((long)root.data+Math.max(l.a,r.a),(long)root.data+l.a+r.a,Math.max(Math.max(l.max,r.max),(long)root.data+l.a+r.a));
    }
	public static long maximumSumLeafPath(BinaryTreeNode<Integer> root) {
        return helper(root).max;
//         long l=pathWithMaxSum(root.left);
//         long r=pathWithMaxSum(root.right);
//         long ans=(long)root.data+l+r;
//         long a=maximumSumLeafPath(root.left);
//         long b=maximumSumLeafPath(root.right);
//         return Math.max(ans,Math.max(a,b));
	} 
	
}

class pair{
    long a;
    long b;
    long max;
    pair(long a,long b,long max){
        this.a=a;
        this.b=b;
        this.max=max;
        //this.v=v;
    }
}
