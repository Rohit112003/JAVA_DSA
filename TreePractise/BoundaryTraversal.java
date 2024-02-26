package TreePractise;

import java.util.ArrayList;
import java.util.Stack;

public class BoundaryTraversal {
    public static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }



    }
    Node root;
    BoundaryTraversal(){
        root = null;
    }
    public static void main(String[] args) {
        BoundaryTraversal tree = new BoundaryTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(3);
        tree.root.right = new Node(9);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(11);
        tree.root.right.left = new Node(19);
        tree.root.right.right = new Node(12);

        finBoundary(tree.root);
    }

    private static void finBoundary(Node root) {
        Stack<Node> st= new Stack<>();
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
