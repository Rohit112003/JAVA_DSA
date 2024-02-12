package TreePractise;

import tree.NewBinaryTree;

public class BasicTree {
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

   BasicTree(){
       root = null;
   }

    public static void main(String[] args) {
       BasicTree tree = new BasicTree();
       tree.root = new Node(1);
       tree.root.left = new Node(2);
       tree.root.right = new Node(3);
       tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new  Node(6);
        tree.root.right.right = new  Node(7);
    }

}
