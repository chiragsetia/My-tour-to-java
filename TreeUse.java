import java.util.Scanner;
import java.util.*;

public class TreeUse {
	
	public static TreeNode<Integer> takeInput(Scanner s) {
		int n;
		System.out.println("Enter next node data");
		n = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(n);
		System.out.println("Enter number of children for " + n);
		int childCount = s.nextInt();
		for (int i = 0; i < childCount; i++) {
			TreeNode<Integer> child = takeInput(s);
			root.children.add(child);
		}
		return root;
	}
	
	public static void print(TreeNode<Integer> root) {
		String s = root.data + ":";
		for (int i = 0; i < root.children.size(); i++) {
			s = s + root.children.get(i).data + ",";
		}
		System.out.println(s);
		for (int i = 0; i < root.children.size(); i++) {
			print(root.children.get(i));
		}
	}
	
	public static TreeNode<Integer> takeInputLevelWise() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter root data");
		int rootData = s.nextInt();
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while (!pendingNodes.isEmpty()) {
			try {
				TreeNode<Integer> frontNode = pendingNodes.dequeue();
				System.out.println("Enter num of children of " + frontNode.data);
				int numChildren = s.nextInt();
				for (int i = 0; i < numChildren; i++) {
					System.out.println("Enter " + (i + 1) + "th child of " + frontNode.data);
					int child = s.nextInt();
					TreeNode<Integer> childNode = new TreeNode<Integer>(child);
					frontNode.children.add(childNode);
					pendingNodes.enqueue(childNode);
				}
			} catch (QueueEmptyException e) {
				// Shouldn't come here
				return null;
			}
		}
		return root;
	}
	public static void printLevelWise(TreeNode<Integer> root){
		/* Your class should be named Solution 
 		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
      Queue<TreeNode<Integer>> q=new LinkedList<>();
      q.add(root);
      int t=1,k=0;
      while(!q.isEmpty())
      {
        for(int i=0;i<t;i++)
        {
        TreeNode<Integer>temp=q.remove();
          if(i==t-1)
             System.out.print(temp.data);
          else
          System.out.print(temp.data+" ");
          
          k=k+temp.children.size();
          for(int j=0;j<temp.children.size();j++)
            q.add(temp.children.get(j));
        }
        System.out.println();
        t=k;
        k=0;
        //System.out.println(t);
      }

	}
	public static void main(String[] args) {
//		Scanner s= new Scanner(System.in);
//		
//		TreeNode<Integer> root = takeInput(s);
		TreeNode<Integer> root = takeInputLevelWise();
		printLevelWise(root);
	}
}

// 1
// 20 3 40 
// 90 50 6 100 
// 150 1000 2000 3000 4000 5000 6000 7000 85 86 87 88 89 92 93 94 95 96 80 83 
1
20 3 40 
90 50 6 100 
150 1000 2000 3000 4000 5000 6000 7000 85 86 87 88 89 92 93 94 95 96 80 83 
