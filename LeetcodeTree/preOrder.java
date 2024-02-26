package LeetcodeTree;
import java.util.*;
class Node{
    int value;
    Node right;
    Node left;
    Node next;
    public Node(int data){
        this.value = data;
        Node left,right = null;
    }
    public Node(int _val, Node _left, Node _right, Node _next) {
        value = _val;
        left = _left;
        right = _right;
        next = _next;
    }


}
 class Pair{
    int hd;
    Node node;
    public Pair(Node node , int hd){
        this.node= node ;
        this.hd = hd;
    }

}
class Pair2{
    int level;

    int num;
    Node node;
    public Pair2(Node node , int num,int level){
        this.node= node ;
        this.num = num;
        this.level = level;
    }

}
public class preOrder {
    Node root;
    public void treeTraversal(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.value+ " ");
        treeTraversal(node.left);
        treeTraversal(node.right);
    }

    public ArrayList<ArrayList<Integer>> LevelOrderTraversal(Node node){
        ArrayList<ArrayList<Integer>> wrapList = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        if(root==null){
            return wrapList;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelNumm = queue.size();
            ArrayList<Integer> sublist = new ArrayList<>();
            for(int i =0;i<levelNumm;i++){
                if(queue.peek().left!=null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right!=null){
                    queue.offer(queue.peek().right);
                }
                sublist.add(queue.poll().value);
            }
            wrapList.add(sublist);
        }
        return wrapList;


    }
    public int widthOfBinaryTree(Node root) {
        if(root==null) return 0;
        Queue<Pair2> q = new LinkedList<>();
        q.offer(new Pair2(root, 1, 0));
        int prevLevel = 0;
        int firstIndex = 1;
        int result = 0;
        while(!q.isEmpty()){
            Pair2 t = q.poll();
            Node tr = t.node;
            int num = t.num;
            int level = t.level;
            //joh ki yaha ho rha ha
            if(level>prevLevel){
                prevLevel = level;
                firstIndex = num;
            }
            result = Math.max(result, num-firstIndex+1);
            if(tr.left!=null) q.offer(new Pair2(tr.left, num*2, level+1));
            if(tr.right!=null) q.offer(new Pair2(tr.right, num*2+1, level+1));
        }
        return result;
    }
    public boolean search(Node root,int n){
        if(root==null){
            return false;
        }
        if(root.value==n){
            return true;
        }
        boolean left = search(root.left,n);
        boolean right = search(root.right,n);

        return left || right;

    }


    public int MaximumDepth(Node node){
        if(node==null){
            return 0;
        }
        int lh = MaximumDepth(node.left);
        int rh = MaximumDepth(node.right);
        return 1+Math.max(lh,rh);

    }

    public int BalncedBinaryTree(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = BalncedBinaryTree(root.left);
        if(lh==-1)return -1;
        int rh = BalncedBinaryTree(root.right);
        if(rh==-1)return -1;
        if (Math.abs(lh-rh)>1) {
            return -1;
        }
        return 1 + Math.max(lh, rh);
    }
    public void PrintLeaves(Node node){
        if(node==null){
            return;
        }
        if(node.left==null && node.right==null){
            System.out.print(node.value + " ");
        }
        PrintLeaves(node.left);
        PrintLeaves(node.right);
    }
    public int leftSum(Node node,int n){
//        int sum = 0;
        if(node== null){
            return 0;
        }


        int lh = leftSum(node.left , 1);
        int rh = leftSum(node.left , 0);
        if(n!=0){
            return (lh+rh+ node.value);

        }

        return lh + rh;

    }
    public int maxPAthSum(Node root){
        int ans[] = new int[1];
         ans[0] = Integer.MIN_VALUE;
        int ansvalue= helper(root, ans);
        return ansvalue;

    }

    private int helper(Node root, int[] ans) {
        if(root==null){
            return 0;
        }
        int lh = Math.max(0,helper(root.left,ans));
        int rh = Math.max(0, helper(root.right,ans));
        ans[0] = Math.max(ans[0], lh+rh+root.value);
        return root.value+Math.max(lh,rh);

    }

    private static ArrayList<Integer> topview(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> map = new TreeMap<>();
        if(root==null){
            return ans;
        }
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair it = q.remove();
            int hd = it.hd;
            Node temp = it.node;
            if(map.get(hd)==null)map.put(hd,temp.value);
            if(temp.left!=null){
                q.add(new Pair(temp.left,hd-1));
            }if(temp.right!=null){
                q.add(new Pair(temp.right, hd+1));
            }
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
    public static ArrayList<Integer> BottomView(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> map = new TreeMap<>();
        if(root==null){
            return ans;
        }
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair it = q.remove();
            int hd = it.hd;
            Node temp = it.node;
            map.put(hd,temp.value);
            if(temp.left!=null){
                q.add(new Pair(temp.left,hd-1));
            }if(temp.right!=null){
                q.add(new Pair(temp.right, hd+1));
            }
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
    public static ArrayList<Integer> rightSideView(Node root) {

        ArrayList<Integer> list = new ArrayList<>();
        if (root == null)
            return list;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty())
        {

            int n = queue.size();


            for (int i = 1; i <= n; i++) {
                Node temp = queue.poll();


                if (i == n)
                    list.add(temp.value);


                if (temp.left != null)
                    queue.add(temp.left);


                if (temp.right != null)
                    queue.add(temp.right);
            }
        }

        return list;



    }
    public static ArrayList<Integer> RightSideViewRecursion(Node root){
        ArrayList<Integer> result = new ArrayList<>();
        rightSideViewRecur(root,result, 0);
        return result;
    }

    private static void rightSideViewRecur(Node root, ArrayList<Integer> result, int currdepth) {
        if(root==null){
            return ;
        }
        if(currdepth==result.size()){
            result.add(root.value);
        }
        rightSideViewRecur(root.right, result,currdepth+1);
        rightSideViewRecur(root.left, result,currdepth+1);
    }

    public Node invertTree(Node root) {

        if(root == null){
            return root;
        }

        Node left = root.left;
        Node right = root.right;
        if(root.left!=null && root.right !=null){
            int value = root.left.value;
            int value2 = root.right.value;
        }

        invertTree(left);
        invertTree(right);

        root.left = right;
        root.right = left;

        return root;
    }

    public boolean getPath(Node root, ArrayList<Integer> arr, int x){
        if(root == null){
            return false;

        }
        arr.add(root.value);
        if(root.value == x){
            return true;
        }
        if(getPath(root.left, arr,  x) || getPath(root.right, arr ,x)){
            return true;
        }
        arr.remove(arr.size()-1);
        return false;
    }
    public Node RightPointers(Node root){
        Node temp = root;
        while(temp!=null && temp.left!=null){
            Node newTemp = temp;
            while(true){
                newTemp.left.next = newTemp.right;
                if(newTemp.next == null) break;
                newTemp.right.next = newTemp.next.left;
                newTemp = newTemp.next;

            }
            temp = temp.next;
        }



        return root;


    }
    public ArrayList<Integer> Allnodes(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }

        list.add(root.value);
        Allnodes(root.left);
        Allnodes(root.right);

        return list;

    }


   

    public static void main(String args[])
    {
        preOrder pt = new preOrder();
        pt.root = new Node(37);
        pt.root.left = new Node(27);
        pt.root.right = new Node(47);
        pt.root.left.left = new Node(22);
        pt.root.left.right = new Node(32);
//        pt.root.left.left.left = new Node(12);
//        pt.root.left.left.right = new Node(25);
        pt.root.right.left = new Node(42);
        pt.root.right.right = new Node(57);
//        pt.root.right.right.left = new Node(52);
//        pt.root.right.right.right = new Node(67);
        pt.PrintLeaves(pt.root);

        System.out.println();
        System.out.println("Preorder traversal of given binary tree is - ");
        pt.treeTraversal(pt.root);
        System.out.println();
        pt.widthOfBinaryTree(pt.root);
        boolean ansvalue = pt.search(pt.root, 52);
        System.out.println(ansvalue + " yo");


//        ArrayList<ArrayList<Integer>> list = ;
//
//        ArrayList<ArrayList<Integer>> list = pt.LevelOrderTraversal(pt.root);
//        System.out.println(list);
//        int ans = pt.MaximumDepth(pt.root);
//        System.out.println(ans);
//        int ans2 = pt.BalncedBinaryTree(pt.root);
//        if(ans2!=-1){
//            System.out.println(true);
//        }
//
//        int value = pt.leftSum(pt.root , 0);
//        System.out.println(value);
//        int ans4 = pt.maxPAthSum(pt.root);
//        System.out.println(ans4);
//
//        ArrayList<Integer> Toplist=  topview(pt.root);
//        System.out.println(Toplist );
//        ArrayList<Integer> BottomList=  BottomView(pt.root);
//        System.out.println(BottomList );
//        ArrayList<Integer> RightView=  rightSideView(pt.root);
//        System.out.println(RightView );
//        ArrayList<Integer> newAns =RightSideViewRecursion(pt.root);
//        System.out.println(newAns);
        System.out.println( pt.invertTree(pt.root));
        ArrayList<Integer>  arr = new ArrayList<>();
        int b = 42;
       boolean newAns =  pt.getPath(pt.root, arr,b );
        System.out.println(newAns);
        ArrayList<ArrayList<Integer>> list =new ArrayList<>();
        System.out.println( list.add(pt.Allnodes(pt.root)));
        ArrayList<Integer> list2 = pt.printBoundry(pt.root);
        System.out.println(list2);





    }
    private boolean isLeaf(Node root) {
        return root.left==null && root.right==null;
    }
    

    private ArrayList<Integer> printBoundry(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(isLeaf(root)==false) list.add(root.value);
        leftBoundry(root,list);
        addLeaves(root,list);
        rightBBoundry(root,list);
        return list;
    }

    private void rightBBoundry(Node root, ArrayList<Integer> list) {
        Node temp = root.right;
        while(temp!=null){
            if(isLeaf(root)){
                list.add(root.value);
            }
            if(temp.right!=null){
                temp = temp.right;
            }else{
                temp = temp.left;
            }
        }
    }

    private void addLeaves(Node root, ArrayList<Integer> list) {
       if(root==null){
           if(isLeaf(root)){
               list.add(root.value);

           }
           return;

       }
       if(root.left!=null){
           addLeaves(root.left,list);

       }
       if(root.right!=null){
           addLeaves(root.right,list);
       }
    }

    private void leftBoundry(Node root, ArrayList<Integer> list) {
        Node temp = root.left;
        while(temp!=null){
            if(isLeaf(root)){
                list.add(root.value);
            }
            if(temp.left!=null){
                temp = temp.left;
            }else{
                temp = temp.right;
            }
        }
        
    }
    public static Node LCAinaBST(Node root, Node p, Node q) {
        // Write your code here.
        if(root==null || root== p|| root==q){
            return root;
        }
        Node left = LCAinaBST(root.left,p,q);
        Node right = LCAinaBST(root.right,p,q);
        if(left==null){
            return right;
        }
        if(right==null){
            return left;
        }
        else{
            return root;
        }

    }


}
