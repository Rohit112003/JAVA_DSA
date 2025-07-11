package NormalQuestion;

import java.util.Arrays;
import java.util.HashMap;

public class SortHeights {
    public static void main(String[] args) {
        String names[]= {"Mary","John","Emma"};
        int heights[] = {180,165,170};
        String ans[] = sortPeople(names,heights);
        System.out.println(Arrays.toString(ans));
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map= new HashMap<>();
        for(int i =0;i <heights.length;i++){
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        for (int i = 0; i < heights.length / 2; i++) {
            int temp = heights[i];
            heights[i] = heights[heights.length - 1 - i];
            heights[heights.length - 1 - i] = temp;
        }
        for(int i =0; i<heights.length; i++){
            names[i] = map.get(heights[i]);
        }
        return names;
    }
}
