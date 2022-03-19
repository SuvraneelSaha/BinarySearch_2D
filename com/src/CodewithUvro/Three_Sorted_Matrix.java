package CodewithUvro;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Three_Sorted_Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println("please enter the target element");
        int target = in.nextInt();
        for(int[] num : arr)
        {
            System.out.println(Arrays.toString(num));

        }

        System.out.println("the index is " + Arrays.toString(search(arr,target)));





    }
    // this function is for the whole scenario for the whole search
    static int[]  search(int[][] matrix , int target)
    {
        // it may be possible that matrix is of 1d
       int rows = matrix.length;
       int col = matrix[0].length;
       // be cautious matrix may be empty include your own check over here
        if(rows==1)
        {
        return binarysearch(matrix,0,0,col-1,target);
        }
        // this is for the edge case if the 2D arrays has only one row ie the 2D array is a disguised 1D array

        // run the loop until and unless only 2 rows are remaining

        int rStart = 0 ;
        int rEnd = rows-1 ;
        // we are eliminating rows but we can also do it column wise
        // no. of columns =
        int cMid = col/2;

        while (rStart<(rEnd-1)) // while this is true it will have more than 2 rows
        {
            int mid = rStart + (rEnd-rStart)/2;
             if(matrix[mid][cMid] == target)
             {
                 return new int[]{mid,cMid};

             }
             if(matrix[mid][cMid] < target)
             {
                 rStart = mid;
             }
             else
             {
                 rEnd = mid;
             }
        }
        // when the while loop breaks we will have now what it is 2 rows
        // now check whether the target element is in the cols of 2 remaining rows
        if(matrix[rStart][cMid] == target)
        {
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart+1][cMid] == target)
        {
            return new int[]{rStart+1,cMid};
        }
        // these above 2 conditions is for those elements which lie in the middle columns of the last 2 remaining rows
        // if matched then ans found

        // if not matched search

        // search in 1st half
        if(target<=matrix[rStart][cMid-1]) // cause the 1st half will be in the upper left hand side
        {
            return binarysearch(matrix,rStart,0,cMid-1,target);
        }
        // search in 2nd half
        if(target>=matrix[rStart][cMid+1] && target <= matrix[rStart][col-1]) // cause the 2nd half will be in the upper roght hand side
        {
            return binarysearch(matrix,rStart,cMid+1,col-1,target);
        }

        // search in 3rd half
        if(target<=matrix[rStart+1][cMid-1]) // cause the 3rd half will lie in the lower left hand side
        {
            return binarysearch(matrix,rStart+1,0,cMid-1,target);
        }

        // search in 4th half
        if(target>=matrix[rStart+1][cMid+1])
        {
            return binarysearch(matrix,rStart+1,cMid+1,col-1,target);
        }


        return new int[]{-1,-1};
    }








    // we need another function for binary search in each rows as well
    static int[] binarysearch(int[][] matrix , int row , int cStart,int cEnd , int target)
    {
        while (cStart<=cEnd)
        {
            int mid = cStart + (cEnd-cStart)/2;
            if(matrix[row][mid] == target)
            {
                return new int[]{row,mid};
            }
            if(matrix[row][mid] < target)
            {
                cStart = mid + 1 ;
            }
            else
            {
                cEnd = mid -1 ;
            }
        }
        return new int[]{-1,-1};

    }
    // this function is for searching in the constant row and between the columns provided after cancelling out
    // the not needed part
}
