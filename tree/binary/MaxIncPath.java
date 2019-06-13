/*Max Increasing Path
Level HARD
Given a binary tree of N nodes, find length of longest path of nodes having values in increasing order. This path need not to start and end at root and leaf node respectively. That is, it can start and end from any node.
Note : A Path should be linear, i.e it should start from a node and end in subtree of that node only.*/

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
	
	public static pair help(BinaryTreeNode<Integer> root){
        if(root==null){
            return new pair(Integer.MIN_VALUE,0,0);
        }
        if(root.left==null&&root.right==null){
            return new pair(root.data,1,1);
        }
        pair left=help(root.left);
        pair right=help(root.right);
    	if(left.v>root.data && right.v>root.data){
            return new pair(root.data,1+Math.max(left.a,right.a),Math.max(Math.max(left.b,right.b),1+Math.max(left.a,right.a)));
        }else if(left.v>root.data){
            return new pair(root.data,1+left.a,Math.max(Math.max(left.b,right.b),Math.max(1+left.a,right.a)));
        }else if(right.v>root.data){
            return new pair(root.data,1+right.a,Math.max(Math.max(left.b,right.b),Math.max(left.a,1+right.a)));
        }
    return new pair(root.data,1,Math.max(Math.max(left.b,right.b),Math.max(left.a,right.a)));
    }
	public static int longestIncreasingPath(BinaryTreeNode<Integer> root) {
        return help(root).b;
    }
	
}
class pair{
    int v;
    int a;
    int b;
    pair(int v,int a,int b){
        this.a=a;
        this.b=b;
        this.v=v;
    }
}
