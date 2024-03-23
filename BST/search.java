package TreePractise.BST;

public class search {
    class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
            this.left=null;
            this.right=null;
        }
    }

    Node root;
    search(){
        root =null;
    }



    Node insert(Node node,int key){
        if(node==null){
            node = new Node(key);
            return node;
        }
        if(key<node.val){
            node.left=insert(node.left,key);
        }else if(key>node.val){
            node.right = insert(node.right,key);
        }
        return node;
    }

    void search(Node node , int key){
        if(node.val == key){
            System.out.println(true);
            return;
        }

        if(node.val<key && node.right!=null){
            search(node.right,key);
        } else if (node.val>key && node.left!=null) {
            search(node.left,key);
        }else{
            System.out.println("not found");
        }
    }

    public static void main(String[] args) {
        search tree = new search();
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);
        tree.search(tree.root,40);
    }

}
