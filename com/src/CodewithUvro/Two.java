package CodewithUvro;

public class Two {
    public static void main(String[] args) {
        // Matrix is sorted in row wise and also column wise manner
        // ex -
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        // as we can see the elements in each row is sorted
        // and also the elements in each col is sorted
        //
        int target = 37 ;
     // we are given the sorted array
        // and we need to utilize it to develop a better approach

    }
}
//CUES :
// 1] SEARCH AN ELEMENT
// 2] BIG RANGE OF DATAS
// 3] HOW TO MINIMIZE THE SEARCH


// CASES OF COMPARISON
// whenever we are compairing the target element with that of the target element  what are the cases we will get
// very similar to that of the binary search conditions
// case 1 : if element == target --> then ans is found
// case 2 : if element we are at < target
// case 3 : the element > target
// in binary search there were upper bound and the lower bound ie the start pointer and the end pointer
//  TIP :
// in matrix related questions when we are trying to reduce the search space we have to think about how we can eliminater rows and cols
//   APPROACH :
// case 3 : EXPLANATION -->
// lower bound will be the the first row and the upper bound will be the last row
// if the element at the arr[0][3] if the last column is 3
// if arr[0][3] > target which means that all the elements lying in the same vertical rows are all greater than the target element
//   POINTS :
// 1] WE ARE CHECKING THE LAST COLUMN
// 2 ] THE TARGET ELEMENT < THE ELEMENT AT THE LAST COL
// WHCIH AUTOMATICALLY MAKES THE OTHER ELEMENT S WHICH ARE LYING IN THE SAME ROW GREATER THAN THE TARGET ELEMENT
//  EX - TARGET ELEMENT 37 ;
// ROW'S LAST ELEMENT IS 40 , THEN AUTOMATICALLY 45 ,49 ,50 > TARGET
// CONCLUSION : IF THE TARGET ELEMENT < THE ELEMENT AT THE LAST COL THEN WE CAN DO
// COLUMN -- ;
// so the entire row will be neglected

// CASE 2 : EXPLANATION --> if ELEMENT < TARGET ;
// then 30 will be the element of comparison
// 30 < 37 which is the target
// so all the elements in the left side of the array will obviously be < the target
// so row ++ ;

// again 35 will be the element of comparison
// as 35 < target so row ++ ;

// then 37 so 37 == 37 so ans found



// Searching SPACE
// STARTING WILL BE FROM ROW 0 AND COLUMN LAST
// SO THE LOOP WILL RUN UNTIL AND UNLESS THE ROW BECOMES < LENGTH
// ANS THE COL  >= 0

// TIME COMPLEXITY OR THE NO. OF STEPS :
// THE ROW IS GOING FROM 0 TO N-1 STEPS
// THE COLUMN IS GOING FROM N-1 TO 0 STEPS
//  SO FOR THE WORST CASE
// 2N CAUSE N-1 IS TREATED AS N
// SO N -- ROW + N-- COLUMN = 2N TIMES IT IS MAKING COMPARISON
// SO TIME COMPLEXITY IS O(N)
// CAUSE CONSTANTS ARE REMOVED FROM THE TIME COMPLEXITY
//

