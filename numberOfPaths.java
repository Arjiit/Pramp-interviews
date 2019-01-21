/*
You’re testing a new driverless car that is located at the Southwest (bottom-left) corner of an n×n grid. The car is supposed to get to the opposite, Northeast (top-right), corner of the grid. Given n, the size of the grid’s axes, write a function numOfPathsToDest that returns the number of the possible paths the driverless car can take.

For convenience, let’s represent every square in the grid as a pair (i,j). The first coordinate in the pair denotes the east-to-west axis, and the second coordinate denotes the south-to-north axis. The initial state of the car is (0,0), and the destination is (n-1,n-1).

The car must abide by the following two rules: it cannot cross the diagonal border. In other words, in every step the position (i,j) needs to maintain i >= j. See the illustration above for n = 5. In every step, it may go one square North (up), or one square East (right), but not both. E.g. if the car is at (3,1), it may go to (3,2) or (4,1).

Explain the correctness of your function, and analyze its time and space complexities.

Example:

input:  n = 4

output: 5 # since there are five possibilities:
          # “EEENNN”, “EENENN”, “ENEENN”, “ENENEN”, “EENNEN”,
          # where the 'E' character stands for moving one step
          # East, and the 'N' character stands for moving one step
          # North (so, for instance, the path sequence “EEENNN”
          # stands for the following steps that the car took:
          # East, East, East, North, North, North)
Constraints:

[time limit] 5000ms

[input] integer n

1 ≤ n ≤ 100
[output] integer

*/


import java.io.*;
import java.util.*;

class Solution {

  static int numOfPathsToDest(int n) {
    // your code goes here
    int[][] res = new int[n][n];
    
 
    for (int i=0; i<n; i++) {
     res[n-1][i] = 1;
      res[i][0] = 1; // res[i][0]
    }
    
    for (int i=1; i<n; i++) {
      for (int j=1; j<n; j++) {  
        if (i>=j) {
        res[i][j] = res[i-1][j] + res[i][j-1];
        }
        }
    }
    
    return res[n-1][n-1]; // res[n-1][n-1]
  }
  
  // n -> input
  // no. of ways = (n^2 - n)/2
  
  //（0，0）-> (1,0) -> (2,0) -> (3,0);
  //
  
  // 0, 0, 2, 5, 9 
  // 0, 1, 2, 3, 4
  // 1, 1, 1, 1, 1
  public static void main(String[] args) {

  }

}