package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    static void levelorder(Node root){
        Queue<Node > q= new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node front = q.poll();
            System.out.print(front.val+" ");
            if (front.left!=null) q.add(front.left);
            if (front.right!=null) q.add(front.right);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        levelorder(a);
    }
}
