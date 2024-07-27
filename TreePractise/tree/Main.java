package Tree;

public class Main {

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
    public static void postOrder(Tree root){
        if(root==null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+ " ");
    }
    public static void inorder(Tree root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.val+ " ");
        inorder(root.right);
    }
    public static void preOrder(Tree root){
        if(root==null){
            return ;
        }
        System.out.print(root.val+ " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public static void main(String[] args) {
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        root.right.left = new Tree(6);
        root.right.left.right = new Tree(7);
//        postOrder(root);
//        System.out.println();
        preOrder(root);
//        System.out.println();
//        inorder(root);

    }

}
