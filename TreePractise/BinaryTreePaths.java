package TreePractise;

import java.util.ArrayList;

public class BinaryTreePaths {

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
    BinaryTreePaths(){
        root=null;
    }
    public static void main(String[] args) {
        BinaryTreePaths tree = new BinaryTreePaths();
        tree.root = new Node(1);
        tree.root.left = new Node(3);
        tree.root.right = new Node(9);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(11);
        tree.root.right.left = new Node(19);
        tree.root.right.right = new Node(12);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> subList = new ArrayList<>();
        getAllPaths(tree.root,list,subList);
        System.out.println(list);

    }

    private static void getAllPaths(Node root,  ArrayList<ArrayList<Integer>> list, ArrayList<Integer> subList) {
        if(root==null){
            return;
        }
        subList.add(root.data);
        if(root.left==null && root.right==null){
            list.add(new ArrayList<>(subList));
        }else{
            getAllPaths(root.left,list,subList);
            getAllPaths(root.right,list,subList);
        }




        subList.remove(subList.size()-1);


    }
}
