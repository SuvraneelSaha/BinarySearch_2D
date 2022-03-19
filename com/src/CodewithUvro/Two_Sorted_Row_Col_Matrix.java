package CodewithUvro;

import java.util.Arrays;

public class Two_Sorted_Row_Col_Matrix {
    public static void main(String[] args) {
        // row wise sorted matrix
        // column wise sorted matrix
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };

        System.out.println(Arrays.toString(search(arr,55)));




    }
    static int[] search(int[][] matrix , int target)
    {
        // starting position will be the first row
        int row = 0 ;
        int col = matrix.length-1;
        // ending position will be the last column

        // condition for the while loop will be
        // row < length of the matrix
        // col >= 0
        while (row<matrix.length && col>=0)
        {
            // case 1 : the element == target
            if(matrix[row][col] == target)
            {
                return new int[]{row,col};

            }
            // case 2 : the element < the target
            if(matrix[row][col] <target)
            {
                row ++ ; // cause in that row all the elements on the left hand side will be < target
            }
            else // that menas the element matrix[row][col] > target
            {
                col -- ;

            }

        }
        return new int[]{-1,-1};
    }
}

// IMPORTANT --
// THE SIZE OF THE MATRIX DOESNT ALWAYS HAVE TO BE N x N
// IT CAN BE LIKE N x M
// where n is the size of the row
// and M is the size of the column
// when we have to just do arr[row].length
