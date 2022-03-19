package CodewithUvro;

public class Three {
    public static void main(String[] args) {
        // Search in a sorted matrix
        // ie all the elements are sorted in a row wise format
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        // this is a sorted matrix
    }
}
// points :
// 1st element of a particular row is > the last element of the previous row
//
// Intersting technique -- > convert the 2d matrix into a 1d array and search for the element
// but
// we are going to search for the target element by using binary search

// IMPORTANT TIP- TRY TO REDUCE THE SEARCH SPACE BY ELIMINATING ROWS AND COLUMNS

// APPROACH -
// 1] WE ARE TAKING THE MIDDLE COLUMN AS THE MATRIX IS SORTED
// AND WE ARE DOING BINARY SEARCH ON IT IN ORDER TO REDUCE NO. OF ROWS
// OR ] ALTERNATE APPROACH WOULD BE TO TAKE MIDDLE ROW AND PERFORM BS
// IN ORDER TO REDUCE THE NO. OF COLUMNS .

// CASE 1 : IF ELEMENT == TARGET --> ANS FOUND
// CASE 2 : IF ELEMENT > TARGET
// THEN ALL THE ROWS AFTER THE ELEMENT WILL BE IGNORED
// CASE 3 : IF ELEMENT < TARGET
// THEN  IGNORE ABOVE ROWS
// THIS is how we are reducing the search space

// IN THE END
// in the end there will be 2 rows remaining
// STEPS :
// 1]CHECK WHETHER THE MID COL YOU ARE AT CONTAINS    THE TARGET ELEMENT
// 2] CONSIDER THE 4 PARTS
// ie the left hand side part and also the right hand side part
//

//TIME COMPLEXITY :
// 1] TOTAL SIZE OF THE COLUMNS WILL BE SIZE OF THE ROWS IF N x N -- N
// BINARY SEARCH FOR N ELEMENTS IS LOG N
// AGAIN WE ARE SEARCHING THE ROWS
// THEN ALSO LOG N
// TOTAL TIME COMPLEXITY IS LOG N + LOG N = 2 LOG N 