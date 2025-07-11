package NormalQuestion;

import java.util.*;
public class LuckyNumber {
    public static void main(String[] args) {

//         [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
        int arr[][] = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        System.out.println(luckyNumbers(arr));



    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        for(int i =0 ;i<matrix.length; i++) {
            Arrays.sort(matrix[i]);

        }
        for(int i =0;i<matrix.length;i++) {
            int val = matrix[i][0];
            for (int j = 1; j < matrix.length; j++) {
                if (val > matrix[j][i]) {
                    break;
                }

            }
//            list.add(matrix[i][])
        }
        return list;








    }
}
