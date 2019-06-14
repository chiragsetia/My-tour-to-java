//ceil and floor value

public class solution {
	public static int Ceil(BinaryTreeNode<Integer> root, int input) {
        if(root==null){
            return Integer.MAX_VALUE;
        }
        if(root.data==input){
            return input;
        }
        int a;
        if(root.data<input){
            return Ceil(root.right,input);
        }else{
            a=Ceil(root.left,input);
        }
        return(Math.min(a,root.data));
	}

}
