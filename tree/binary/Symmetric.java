/*
Given a Binary Tree of size N, your task is to complete the function isSymettric(), that check whether a binary is Symmetric or not, i.e. the binary tree is Mirror image of itself or not.
For example:
The following binary tree is symmetric:

        1
      /   \
    2       2
  /   \   /   \
 3     4 4     3


class Node
{
	int key;
	 Node left, right;
	 
	 Node(int data)
	 {
	     key = data;
	     left = right = null
	 }
}
*/
// complete this function
// return true/false if the is Symmetric or not
class GfG
{
    public static boolean isSymmetric(Node root)
    {
        return help(root,root);
    }
    private static boolean help(Node root1,Node root2){
        if(root1==null&&root2==null){
		    return true;
		}else if((root1!=null&&root2==null)||(root1==null&&root2!=null)){
		    return false;
		}
		return(root1.data==root2.data&&help(root1.left,root2.right)&&help(root1.right,root2.left));
    }
}
