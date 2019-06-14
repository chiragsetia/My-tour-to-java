/*
Maximum node in between
Level MEDIUM
Given a BST (Binary search tree) with N number of nodes and two nodes X and Y (which are definitely present in the input BST). 
You need to return the maximum node that lies in between the nodes X and Y (both inclusive) in the given BST. That is, you need to
*/

public class Solution {
	static  BinaryTreeNode<Integer> lcs( BinaryTreeNode<Integer> root,int a,int b){
        if(root==null){
            return null;
        }
        if(root.data>a&&root.data>b){
            return lcs(root.left,a,b);
        }
        if(root.data<a&&root.data<b){
            return lcs(root.right,a,b);
        }
        return root;
    }
	public static int maxNodeInBetween(BinaryTreeNode<Integer> root, int x, int y) {
        root=lcs(root,x,y);
        if(root.data==x){
//             if(root.data>y){
//                 return root.data;
//             }
            return max(root,y);
        }else if(root.data==y){
//             if(root.data>x){
//                 return root.data;
//             }
            return max(root,x);
        }else{
            return (max(root,Math.max(x,y)));
        }
        
		
	}
    private static int max(BinaryTreeNode<Integer> root,int a){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        if(root.data==a){
            return root.data;
        }
        int m=root.data;
        if(root.data<a)
        	m=Math.max(m,max(root.right,a));
        return m;
    }
}
