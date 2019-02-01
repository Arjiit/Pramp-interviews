/*
Award Budget Cuts

The awards committee of your alma mater (i.e. your college/university) asked for your assistance with a budget allocation problem they’re facing. Originally, the committee planned to give N research grants this year. However, due to spending cutbacks, the budget was reduced to newBudget dollars and now they need to reallocate the grants. The committee made a decision that they’d like to impact as few grant recipients as possible by applying a maximum cap on all grants. Every grant initially planned to be higher than cap will now be exactly cap dollars. Grants less or equal to cap, obviously, won’t be impacted.

Given an array grantsArray of the original grants and the reduced budget newBudget, write a function findGrantsCap that finds in the most efficient manner a cap such that the least number of recipients is impacted and that the new budget constraint is met (i.e. sum of the N reallocated grants equals to newBudget).

Analyze the time and space complexities of your solution.

Example:

input:  grantsArray = [2, 100, 50, 120, 1000], newBudget = 190

output: 47 # and given this cap the new grants array would be
           # [2, 47, 47, 47, 47]. Notice that the sum of the
           # new grants is indeed 190
Constraints:

[time limit] 5000ms

[input] array.double grantsArray

0 ≤ grantsArray.length ≤ 20
0 ≤ grantsArray[i]
[input] double newBudget

[output] double
*/

 import java.io.*;
import java.util.*;

class Solution {
  
  static double findGrantsCap(double[] grantsArray, double newBudget) {
    // your code goes here
    int n = grantsArray.length;
    double initBudget = newBudget/n;
    for (int i=0; i< grantsArray.length; i++) {
      if (grantsArray[i] <= initBudget) {
        System.out.println(initBudget);
        initBudget = initBudget + (double)((initBudget - grantsArray[i])/(n - i - 1)); 
    
      } else {
        grantsArray[i] = initBudget;
      }
    }
    return initBudget;
    
  }
/* 38, 36
  38 + 9 = 47
  47
  47
  47
  
  [2,100,30,120,1000]
  2
  47
  30
  47+8.5
  47 + 8.5
 */
  public static void main(String[] args) {

  }

}