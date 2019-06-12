//leaves at same level

public class Solution {

    static int t=-1;
	public static void checkLeaves(BinaryTreeNode<Integer> root) {
        t=-1;
        if(helper(root,0)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
	}
    private static boolean helper(BinaryTreeNode<Integer> root,int n){
        if(root==null){
            return true;
        }
        if(root.left==null&&root.right==null){
            if(t==-1){
                t=n;
                return true;
            }else{
                return t==n;
            }
        }
        return helper(root.left,n+1)&&helper(root.right,n+1);
    }
	
}
