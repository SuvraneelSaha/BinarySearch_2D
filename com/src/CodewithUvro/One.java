package CodewithUvro;

import java.util.Arrays;
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        // Searching in matrices ie 2D arrays
        // An example of searching an element in a 2D array
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the size of the 2D array");
        int n = in.nextInt();

        int[][] arr = new int[n][n];

        // for taking the elements :
        System.out.println("please enter the elements :");
        for(int row = 0 ; row <arr.length;row++)
        {
            for (int col = 0; col <arr[row].length ; col++)
            {
                arr[row][col] = in.nextInt();
            }
        }
        // Scanning done

       // printing the original 2d array :

        for(int[] num : arr)
        {
            System.out.println(Arrays.toString(num));

        }

        System.out.println("please enter the element to search for in the 2D array :");
        int target = in.nextInt();

        // return the index if found
        System.out.println("the index of the target element is "+ Arrays.toString(target(arr, target)));





    }
    static int[] target(int[][] arr,int target)
    {
        for(int row = 0 ; row <arr.length;row++)
        {
            for (int col = 0; col <arr[row].length ; col++)
            {
                if(arr[row][col] == target)
                {
                    return new int[]{row, col};


                }
            }
        }
        return new int[] {-1,-1};



    }
}

// time complexity is O(nxn)
// cause both the rows and the columns are to be considered
// say for ex - if size of the row was - n and the size of the col was m
// then the time complexity would be n x m
// cause it is searching for every element
// outer loop is for each rows
// and the inner loop is for each column
