package tree;
class s {
    int key;
    s left, right;
    public s(int item) {
        key = item;
        left = right = null;
    }
}
class BinaryTree {
    s root;
    BinaryTree() { root = null; }
    void printPreorder(s node)
    {
        if (node == null)
            return;
        System.out.print(node.key + " ");

        printPreorder(node.left);

        printPreorder(node.right);
    }
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new s(1);
        tree.root.left = new s(2);
        tree.root.right = new s(3);
        tree.root.left.left = new s(4);
        tree.root.left.right = new s(5);

        // Function call
        System.out.println(
                "Preorder traversal of binary tree is ");
        tree.printPreorder(tree.root);
    }
}