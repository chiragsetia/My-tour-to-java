/*Level MEDIUM
Given a binary search tree and a integer S, find pair of nodes in the BST which sum to S. You can use extra space only O(log n).
Assume BST contains all unique elements.

Given a binary search tree and a integer S, find pair of nodes in the BST which sum to S. You can use extra space only O(log n).
Assume BST contains all unique elements
	*/
import java.util.*;
public class Solution {





	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
	Stack<BinaryTreeNode<Integer>> l=new Stack<>(),r=new Stack<>();	
        BinaryTreeNode<Integer> root1=root;
        while(root!=null){
            l.push(root);
            root=root.left;
        }
        while(root1!=null){
            r.push(root1);
            root1=root1.right;
        }
        while(l.peek().data<r.peek().data){
            BinaryTreeNode<Integer> r1=l.pop();
            BinaryTreeNode<Integer> r2=r.pop();
            if(r1.data+r2.data==s){
                System.out.println(r1.data+" "+r2.data);
                r2=r2.left;
                while(r2!=null){
                    r.push(r2);
                    r2=r2.right;
                }
                 r1=r1.right;
                while(r1!=null){
                    l.push(r1);
                    r1=r1.left;
                }
            }else if(r1.data+r2.data>s){
                l.push(r1);
                r2=r2.left;
                while(r2!=null){
                    r.push(r2);
                    r2=r2.right;
                }
            }
            else{
                r.push(r2);
                r1=r1.right;
                while(r1!=null){
                    l.push(r1);
                    r1=r1.left;
                }
            }
            if(l.isEmpty()||r.isEmpty()){
                return;
            }
        }
	}
}
