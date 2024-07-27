package tree;

public class NewBinaryTree {
     static class Node{
        int value;
        Node left;
        Node right;

        public Node(int val){
            this.value = val;
            Node left=null;
            Node right = null;
        }
    }
    Node root;
    NewBinaryTree(){
        root =null;
    }

     void printPreorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.value);
        printPreorder(root.left);
        printPreorder(root.right);
    }

    public int diameterBinaryTree(Node root){

        int[] diameter = new int[1];
        height(root,diameter);
        return diameter[0];
    }
    public int height(Node root, int[] diameter){
        if(root==null){
            return 0;
        }
        int lh = height(root.left,diameter);
        int rh = height(root.right, diameter);
        diameter[0] = Math.max(diameter[0], lh+rh);
        return 1+ Math.max(lh,rh);
    }

    public static void main(String[] args) {
        NewBinaryTree tree = new NewBinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        tree.printPreorder(tree.root);
        System.out.println(tree.diameterBinaryTree(tree.root));
        ;
    }
}
