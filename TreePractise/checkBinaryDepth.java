package TreePractise;

public class checkBinaryDepth {
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
    checkBinaryDepth(){
        root =null;
    }
    public static void main(String[] args) {
        checkBinaryDepth tree= new checkBinaryDepth();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        checkBinary(tree.root);

    }

    private static void checkBinary(Node root) {
        System.out.println(dfHeight(root)!=-1);

    }

    private static int dfHeight(Node root) {
        if(root==null){
            return 0;
        }
        int lh = dfHeight(root.left);
        if(lh==-1){
            return -1;
        }int rh = dfHeight(root.right);
        if(rh==-1){
            return -1;
        }
        if(Math.abs(lh-rh)>1) return -1;
        return Math.max(lh,rh)+1;

    }
}
