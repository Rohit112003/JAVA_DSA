package TreePractise;

import java.util.*;

import java.util.ArrayList;

public class IterativeInorder {
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
    IterativeInorder(){
        root =null;
    }

    public static void main(String[] args) {
        IterativeInorder tree = new IterativeInorder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        Iterativeinord(tree.root);
    }

    private static void Iterativeinord(Node root) {
        Stack<Node> st = new Stack();
        ArrayList<Integer> list = new ArrayList<>();
        Node newRoot = root;
        while (true){
            if(newRoot!=null){
                st.push(newRoot);
                newRoot=newRoot.left;
            }else{
                if(st.isEmpty()){
                    break;
                }
                newRoot = st.pop();
                list.add(newRoot.data);
                newRoot = newRoot.right;
            }
        }
        System.out.println(list);
    }
}
