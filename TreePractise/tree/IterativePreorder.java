package Tree;

import OOP.access.A;

import java.util.ArrayList;
import java.util.Stack;

public class IterativePreorder {
    static class  Tree{
        int val;
        Tree left;
        Tree right;


        public Tree(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }


    }
    public static void IterativePre(Tree root){
        Stack<Tree> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        st.add(root);
        while(!st.isEmpty()){
            Tree node =st.pop();
            if(node.right!=null){
                st.add(node.right);
            }
            if(node.left!=null){
                st.add(node.left);
            }
            list.add(node.val);
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
       Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        root.right.left = new Tree(6);
        root.right.left.right = new Tree(7);
        IterativePre(root);


    }

}
