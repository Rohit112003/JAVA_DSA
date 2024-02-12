package TreePractise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepth {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    Node root;
    MaximumDepth(){
        root = null;
    }

    public static void main(String[] args) {
        MaximumDepth tree = new MaximumDepth();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        levelOrder(tree.root);
    }

    private static void levelOrder(Node root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }

        Queue<Node> q = new LinkedList<>();
        int count = 0;
        q.offer(root);

        while (!q.isEmpty()) {
            int levelNum = q.size();
            for (int i = 0; i < levelNum; i++) {
                Node current = q.poll();
                if (current.left != null) {
                    q.offer(current.left);
                }
                if (current.right != null) {
                    q.offer(current.right);
                }
            }
            count++;
        }
        System.out.println("Maximum Depth of the tree is: " + count);
    }

}
