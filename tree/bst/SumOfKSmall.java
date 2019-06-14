//Given a binary search tree and an integer k,find the sum of first k smallest elements.

import java.util.*;

public class solution {
    static int t=0;
	public static int ksmallestElementSum(BinaryTreeNode<Integer> root, int k) {
        if(root==null){
            return 0;
        }
        if(t>=k){
            return 0;
        }
        int sum=ksmallestElementSum(root.left,k);
        if(t<k){
            sum+=root.data;
                t++;
        }
        sum+=ksmallestElementSum(root.right,k);
        return sum;
	}

}
