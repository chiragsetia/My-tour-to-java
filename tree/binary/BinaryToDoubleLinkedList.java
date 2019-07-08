/*
Given a Binary Tree (BT), convert it to a Doubly Linked List(DLL) In-Place.
The left and right pointers in nodes are to be used as previous and next pointers respectively in converted DLL.
The order of nodes in DLL must be same as Inorder of the given Binary Tree.
The first node of Inorder traversal (left most node in BT) must be head node of the DLL.
*/

class gfg{
    Node bToDLL(Node root)
    {
        Node head=root;
        while(head.left!=null){
            head=head.left;
        }
        update(root);
        return head;
    }
    Node update(Node root)
    {
        if(root==null){
            return root;
        }
        Node left=update(root.left);
        if(left!=null)
        {
            Node l=left;
            // while(l.right!=null){
            //     l=l.right;
            // }
            l.right=root;
        }
        root.left=left;
        Node right=update(root.right);
        if(right!=null){
            Node r=right;
            while(r.left!=null){
                r=r.left;
            }
            r.left=root;
            right=r;
        }
        root.right=right;
        while(root.right!=null){
            root=root.right;
        }
        return root;
    }
}
