//bottom view of a tree









class Node {
    int data; //data of the node
    int hd; //horizontal distance of the node
    Node left, right; //left and right references
    public Node(int key)
    {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}*/
class Tree
{
    // Should print bottom view of tree with given root
    public void bottomView(Node root)
    {
        Map<Integer,Integer>  map=levelOrder(root);
        List<Integer> list=new ArrayList<>(map.keySet());
        Collections.sort(list);
        // System.out.println(map);
        // System.out.println(list);
        for(Integer i:list){
            System.out.print(map.get(i)+" ");
        }
    }
    public Map<Integer,Integer> levelOrder(Node root){
        if(root==null){
            return new HashMap<>();
        }
        Map<Integer,Integer> map=new HashMap<>();
        Queue<Node> q=new LinkedList<>();
        root.hd=0;
        q.add(root);
        while(!q.isEmpty()){
            root=q.remove();
            map.put(root.hd,root.data);
            if(root.left!=null){
                root.left.hd=root.hd-1;
                q.add(root.left);
            }
            if(root.right!=null){
                root.right.hd=root.hd+1;
                q.add(root.right);
            }
        }
        return map;
    }
}
	
