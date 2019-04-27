import java.util.*;
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

	public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre,
			int[] in){
		return helper(pre,in,0,pre.length-1,0,in.length-1);
	}
	private static BinaryTreeNode<Integer> helper(int []pre,int []in,int ps,int pe,int is,int ie){
		if(ps>pe||is>ie){
			return null;
		}
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(pre[ps]);
		int i;
		for ( i=is; i<=ie;i++ ) {
				if(in[i]==pre[ps])
					break;
		}
		int newPe=ps+i-is;
		root.left=helper(pre,in,ps+1,newPe,is,i-1);
		root.right=helper(pre,in,newPe+1,pe,i+1,ie);
		return root;
	}
	/* class Node<T> {
		T data;
		Node<T> next;
		Node(T data){
			this.data = data;
		}
	}
*/
	public static ArrayList<Node<BinaryTreeNode<Integer>>> LLForEachLevel(BinaryTreeNode<Integer> root) {
      ArrayList<Node<BinaryTreeNode<Integer>>> list= new ArrayList<>();
      if(root==null){
      	return null;
      }
      Queue<BinaryTreeNode<Integer>> q=new LinkedList<>();
      q.add(root);
      while(!q.isEmpty()){
      	int t=q.size();
      	ArrayList<Node<BinaryTreeNode<Integer>>> listL= new ArrayList<>();
      	for(int i=0;i<t;i++){
      		BinaryTreeNode<Integer>e= q.remove();
      		//System.out.println(e);
      		if(e.left!=null){
      			q.add(e.left);
      		}
      		if(e.right!=null){
      			q.add(e.right);
      		}
      		Node<BinaryTreeNode<Integer>> node= new Node<>(e);
      		listL.add(node);
      	}
      	if(listL.size()!=0){
      		//System.out.println(listL);
      		list.add(headReturn(listL));
      	}
      }
      //System.out.println(list);
      return list;
	}
	private static Node<BinaryTreeNode<Integer>> headReturn(ArrayList<Node<BinaryTreeNode<Integer>>> list){
		return list.get(0);
	}

}
