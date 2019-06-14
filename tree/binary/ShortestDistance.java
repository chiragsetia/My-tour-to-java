/*Shortest Distance
Level MEDIUM
Given a Binary Search Tree and two keys in it. Find the distance between two nodes with given two keys. It may be assumed that both keys exist in BST*/

import java.util.*;

public class solution {
    static int dist(BinaryTreeNode<Integer> root, int a){
        if(root.data==a){
            return 0;
        }
        int h;
        if(root.data>a){
            h=dist(root.left,a);
        }else{
            h=dist(root.right,a);
        }
        return h+1;
    }
	static int findDist(BinaryTreeNode<Integer> root, int a, int b)
	{	
        BinaryTreeNode<Integer> lcsRoot=lcs(root,a,b);
        int h=dist(lcsRoot,a);
        h+=dist(lcsRoot,b);
        return h;
	}
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

}
