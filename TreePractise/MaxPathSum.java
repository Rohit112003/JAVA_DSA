package TreePractise;

public class MaxPathSum {

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
    MaxPathSum(){
        root = null;
    }
    public static void main(String[] args) {
        MaxPathSum tree = new MaxPathSum();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(3);
        tree.root.right.right = new Node(4);

        System.out.println(maxPath(tree.root, 0));

    }

    private static int maxPath(Node root,int max) {

        if(root==null){
            return 0;
        }
        int leftSum = Math.max(0,maxPath(root.left, max));
        int rightSum = Math.max(0,maxPath(root.right, max));

        max = Math.max((leftSum+rightSum+root.data), max);
        return root.data + Math.max(leftSum, rightSum);
    }
}
