package CodewithUvro;
// Question link : https://leetcode.com/problems/search-a-2d-matrix-ii/submissions/

public class Search_in_2D_matrix{
    public static void main(String[] args) {
        int[][] arr = {
                {-1,3}
        };
        System.out.println(search(arr,3));


    }
    static boolean search(int[][] matrix , int target)
    {


        int row = 0 ;
        int col = matrix[0].length-1;
        while (row<matrix.length && col>=0)
        {
            if(matrix[row][col] == target)
            {
                return true;
            }
            if(target < matrix[row][col])
            {
                col--;
            }
            else
            {
                row++;
            }
        }
        return false;
    }
}
