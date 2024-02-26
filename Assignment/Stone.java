package Assignment;

import java.util.HashSet;

public class Stone {
    public static void main(String[] args) {
        int n = 9;
        int[] weight = {5,7,4,2,6};
        int m = weight.length;
        int ans = stonePick(n,weight,m);
        System.out.println(ans);
    }

    private static int stonePick(int n, int[] weight, int m) {
        int count = 0;
        HashSet<Integer> set  = new HashSet<>();
        for(int i =0; i<m-1;i++){
            set.add(weight[i]);
        }
        for (int i = 0; i < m-1; i++) {
            int val = n - weight[i];
            if(set.contains(val)){
                count++;
                set.remove(val);
            }
        }
        return count;
    }
}
