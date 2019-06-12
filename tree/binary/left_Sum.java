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
	
	public static int findSum(BinaryTreeNode<Integer> root) {
		if(root==null){
            return 0;
        }
        int sum=0;
        if(root.left!=null){
            sum+=root.left.data;
        }
        sum+=findSum(root.left);
        sum+=findSum(root.right);
        return sum;
		
	}
	
}
