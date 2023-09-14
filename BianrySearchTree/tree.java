package BianrySearchTree;

public class tree {
    int value;
    tree LeftChild;
    tree RightChild;

    tree(int value ){
        this.value= value;
        this.LeftChild = null;
        this.RightChild = null;
    }

    public static tree  insert(int value, tree current){
        if(current == null){
            tree newNode = new tree(value);
            return newNode;

        }
        if(value< current.value){
            current.LeftChild = insert(value, current.LeftChild);
        }else{
            current.RightChild = insert(value, current.RightChild);
        }
        return current;

    }

    public static void main(String[] args) {
        tree root = new tree(30);
        root = root.insert(15, root);
        root = insert(7, root);
        root = insert(20, root);
        root = insert(5, root);
        root = insert(9, root);
        root = insert(21, root);

        System.out.println( root);

    }
}
