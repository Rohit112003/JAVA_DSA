package TreePractise;

public class CheckSymmetric {
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
    CheckSymmetric(){
        root = null;
    }

    public static void main(String[] args) {
        CheckSymmetric tree = new CheckSymmetric();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(3);
        tree.root.right.right = new Node(4);

        System.out.println(symmetric(tree.root.left,tree.root.right));
    }

    private static boolean symmetric(Node p1, Node p2) {
        if(p1==null && p2==null){
            return true;
        }
        if(p1!=null && p2!=null && p1.data== p2.data){
            boolean halfpart1=symmetric(p1.left, p2.right);
            boolean halfPart2= symmetric(p1.right, p2.left);
            if(halfpart1==true && halfPart2==true){
                return true;
            }

        }
        return false;

    }


}
