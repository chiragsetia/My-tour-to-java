/*Leaf Nodes from Preorder of BST
Level MEDIUM
Given a Preorder traversal of a Binary Search Tree.Print leaf nodes of the Binary Search Tree from the given preorder*/

import java.util.*;

public class solution {
	public static void leafNode(int arr[], int n) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                s.push(arr[i]);
                
            }else
            {
                if(!(s.isEmpty())&&arr[i+1]>s.peek()){
                    System.out.print(arr[i]+" ");
                
            }
                while(!(s.isEmpty())&&arr[i+1]>s.peek())
                    s.pop();
            }
        }
        System.out.print(arr[n-1]);
	}

}
