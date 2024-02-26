package TreePractise;

import java.util.ArrayList;

public class getPath {

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
    getPath(){
        root = null;
    }

    public static void main(String[] args) {
        getPath tree = new getPath();
        tree.root = new Node(1);
        tree.root.left = new Node(3);
        tree.root.right = new Node(9);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(11);
        tree.root.right.left = new Node(19);
        tree.root.right.right = new Node(12);

        ArrayList<Integer> list = new ArrayList<>();
        
        gettingPath(tree.root,list,12);
        System.out.println(list);
        
    }

    private static boolean gettingPath(Node root,ArrayList<Integer> list,int x) {
        if(root==null){
            return false;
        }
        list.add(root.data);
        if(root.data==x){
            return true;
        }
        if(gettingPath(root.left, list,x) || gettingPath(root.right,list,x)){
            return true;
        }
        list.remove(list.size()-1);
        return false;
    }
}
