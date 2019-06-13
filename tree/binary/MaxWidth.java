/*Max Width
Level HARD
Given a binary tree with N nodes, find and return the maximum width of given tree./*

//it is the number of nodes at each level.

import java.util.*;
public class Solution {


	
	public static int maximumWidth(BinaryTreeNode<Integer> root) {
        if(root==null){
            return 0;
        }
        Queue<BinaryTreeNode<Integer>> q=new LinkedList<>();
        q.add(root);
        int max=q.size();
        while(!q.isEmpty()){
        	int t=q.size();
        	if (max<t) {
        		max=t;
        	}
        	for(int i=0;i<t;i++){
        		BinaryTreeNode<Integer> temp=q.remove();
        		if(temp.left!=null){
        			q.add(temp.left);
        		}
        		if(temp.right!=null){
        			q.add(temp.right);
        		}
        	}
        }
        return max;
	}
	
}
