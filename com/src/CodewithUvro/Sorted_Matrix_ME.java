package CodewithUvro;

import java.util.ArrayList;

// Question link : https://leetcode.com/problems/search-a-2d-matrix/
public class Sorted_Matrix_ME {
    public static void main(String[] args) {
        int[][] arr = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        System.out.println(searchMatrix(arr,3));


    }
    static boolean searchMatrix(int[][] arr, int target)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int row = 0; row <arr.length ; row++)
        {
            for (int col = 0; col <arr[row].length ; col++)
            {
                list.add(arr[row][col]);
            }
        }
        // Scanning done
        // transferred the elements in the 2d matrix or 2D array into an arraylist
        int[] newarr = new int[list.size()];
        // we are making a new integer array of size which is equal to that of the arraylist
        // and the size of the arraylist depends on the size of the no. of elements present inside the arraylist
        for (int i = 0; i <newarr.length ; i++)
        {
            newarr[i] = list.get(i);
        }
        // Scanning done for the new int array
        // we have transferred the elements present inside the arraylist within the new int array

        if(target == binarysearch(newarr,target))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    static int binarysearch(int[] arr,int target)
    {
        int start = 0 ;
        int end = arr.length -1 ;
        while (start<=end)
        {
            int mid = start + (end - start)/2;
            if(target>arr[mid])
            {
                start = mid +1 ; // when the target > arr[mid]
            }
            else if(target<arr[mid])
            {
                end = mid -1 ; // when the target < arr[mid]
            }
            else
            {
                return arr[mid] ;
            }
        }
        return -1;
    }
}
// runtime -  4 ms, faster than 5.12% of Java online submissions for Search a 2D Matrix.
// SO WHAT WE LEARNED
// 1] HOW TO USE ARRAYLIST
// 2] TRANSFERRING THE ELEMENTS OF A 2D ARRAY INTO AN ARRAYLIST
// 3] THEN TRANSFERRING THE ELEMENTS INTO AN ARRAY
// 4] SEARCHING FOR THE TARGET ELEMENT IN THE NEW ARRAY BY USING BINARY SEARCH
// THIS TECHNIQUE IS VERY LOW LEVEL - BRUTE FORCE

