
package BackTracking;
import java.util.*;
public class combinatons {
    public static void main(String[] args) {
        int n = 4;
        int k =2;
//        int[] newArray = new int[n];
//        for(int i = 1; i<=n; i++){
//            newArray[i] = i;
//        }
        List<List<Integer>> list =  combine(n,k);
        System.out.println(list);
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        generateCombinations(1,new ArrayList<Integer>(),k,res,n);
        return res;
    }

    static void generateCombinations(int start,List<Integer> curr,int k,List<List<Integer>> res,int n){
        if(curr.size()==k){
            res.add(new ArrayList(curr));
            return;
        }
        for(int i=start;i<=n;i++){
            curr.add(i);
            generateCombinations(i+1,curr,k,res,n);
            curr.remove(curr.size()-1);
        }
    }
}
