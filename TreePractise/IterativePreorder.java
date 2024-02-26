package TreePractise;

import java.util.*;

public class IterativePreorder {
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
    IterativePreorder(){
        root = null;
    }


    public static void main(String[] args) {
        IterativePreorder tree = new IterativePreorder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new  Node(7);

        IterativePre(tree.root);
    }

    private static void IterativePre(Node root) {
        Stack<Node> st = new Stack();
        ArrayList<Integer> list = new ArrayList<>();
        st.add(root);
        while(!st.isEmpty()){
            Node newRoot = st.pop();
            list.add(newRoot.data);
            if(newRoot.right!=null){
                st.add(newRoot.right);
            }if(newRoot.left!=null){
                st.add(newRoot.left);
            }

        }
        System.out.println(list);
    }
}
