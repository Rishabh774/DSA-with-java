package BinaryTree;

public class BasicMethods {

    static int size(Node root){
        if (root ==null) return 0;
        int leftsize= size(root.left);
        int rightsize= size(root.right);
        return 1+leftsize+rightsize;
    }
    static  int max(Node root){
        if (root==null ) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(max(root.left),max(root.right)));
    }

    public static void main(String[] args) {
        //  1
//        /   \
//        2     3
//       / \   / \
//       4  5  6   7
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right= g;
        int size = size(a);
       // System.out.println( "Size of binary tree :"+size);
        int maximum = max(a);
        System.out.println(maximum);

    }

}
