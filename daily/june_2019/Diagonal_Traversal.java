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
	
	public static void printDiagonal(BinaryTreeNode<Integer> root) {
    	if(root==null){
            return;
        }
        printDiagonal(root.left);
        System.out.println(root);
        printDiagonal(root.right);
//         HashMap<Integer, List<Integer>> map=new HashMap<>();
//         map=inOrder(root,0,map);
//         Set<Integer> set=map.keySet();
//         for(int i:set){
//             for(Integer j:map.get(i)){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
    }
    private static HashMap<Integer, List<Integer>> inOrder(BinaryTreeNode<Integer> root,int t,HashMap<Integer, List<Integer>> map ){
        if(root==null){
            return map;
        }
        if(map.containsKey(t)){
            map.get(t).add(root.data);
            //map.put(t,map.get(t));
            //map.remove(t);
        }else{
            List<Integer> list=new ArrayList<>();
            list.add(root.data);
            map.put(t,list);
        }
        map=inOrder(root.left,t-1,map);
        map=inOrder(root.right,t,map);
        return map;
    }
}
