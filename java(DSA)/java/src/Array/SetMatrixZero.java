package Array;

import java.util.Arrays;

class SetMatrixZero {
    public static void main(String[] args) {
        int [][] array = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(array);
        System.out.println(array[0].length);
        System.out.println(Arrays.deepToString(array));

    }
    public static void setZeroes(int[][] matrix) {
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    setMatrixZero(matrix, i,j);
                }
            }
        }
        for(int i =0; i<matrix.length; i++){
            for(int j =0; j<matrix[0].length;j++){
                if(matrix[i][j]==-10){
                    matrix[i][j]=0;
                }
            }
        }
    }


    public static void setMatrixZero(int [][] matrix, int i, int j){
        int row=matrix[0].length;
        int col = matrix.length;
        for(int m=0; m<row; m++){
            //row
            if(matrix[i][m]!=0){
                matrix[i][m]=-10;
            }

        }
        //column
        for(int m=0; m<col; m++){
            if(matrix[m][j]!=0){
                matrix[m][j]=-10;
            }

        }
    }
}