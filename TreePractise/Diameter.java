package TreePractise;

public class Diameter {

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
    Diameter(){
        root = null;
    }
    public static void main(String[] args) {
        Diameter tree = new Diameter();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        checkDiameter(tree.root,0);
        System.out.println(checkDiameter(tree.root,0));

    }

    private static int checkDiameter(Node root, int max) {

        if(root==null){
            return 0 ;
        }
        int lh = checkDiameter(root.left,max);
        int rh = checkDiameter(root.right, max);

        max = Math.max(lh+rh, max);

        return Math.max(lh, rh) + 1;


    }
}
