import java.util.Arrays;

public class leetcode {
    public static void main(String[] args) {
        int[] spells = {5,1,4};
        int[] potions = {1,2,3,4,5};
        int success = 7;
//        int [] ans = successfulPairs(spells, potions, success);
//        System.out.println(Arrays.toString(ans));
        int[] people = {9};
//        int limit = 3;
//        int ans = numRescueBoats(people,limit);
//        System.out.println(ans);]
        int[] ans = plusOne(people);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int res[]=new int[spells.length];
        int k=0;
        for(int i=0;i<spells.length;i++){
            int low=0;
            int high=potions.length-1;
            while(low<high){
                int mid=low+(high-low)/2;
                if((long)spells[i]*potions[mid]>=success)
                    high=mid;
                else
                    low=mid+1;
            }
            if((long)potions[low]*spells[i]<success)
                res[k++]=0;
            else
                res[k++]=potions.length-low;
        }
        return res;
    }

    public static int numRescueBoats(int[] people, int limit) {

        int noOfBoat = 0;
        Arrays.sort(people);
        int first = 0;
        int last  = people.length-1;

        while(first<=last){
            int sum = people[first]+ people[last];
            if(sum<=limit){
                noOfBoat++;
                last--;
                first++;

            }else{
                noOfBoat++;
                last--;
            }
        }
        return noOfBoat;



    }
//    private List<Integer> res = new ArrayList<>();
//    public List<Integer> inorderTraversal(TreeNode root) {
//        traverse(root);
//        return res;
//    }
//
//    private void traverse(TreeNode root) {
//        if (root == null) {
//            return;
//        }
//        traverse(root.left);
//        res.add(root.val);
//        traverse(root.right);
//    }
public static int[] plusOne(int[] digits) {
    for(int i = digits.length-1; i>=0; i--){
        if(digits[i]<9){
            digits[i]++;
            return digits;
        }
        digits[i] = 0;

    }
    digits = new int[digits.length+1];
    digits[0]=1;
    return digits;

}
}
