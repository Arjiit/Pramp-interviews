/*
Given an unsorted array of integers arr and a number s, write a function findArrayQuadruplet that finds four numbers (quadruplet) in arr that sum up to s. Your function should return an array of these numbers in an ascending order. If such a quadruplet doesn’t exist, return an empty array.

Note that there may be more than one quadruplet in arr whose sum is s. You’re asked to return the first one you encounter (considering the results are sorted).

Explain and code the most efficient solution possible, and analyze its time and space complexities.

Example:

input:  arr = [2, 7, 4, 0, 9, 5, 1, 3], s = 20

output: [0, 4, 7, 9] # The ordered quadruplet of (7, 4, 0, 9)
                     # whose sum is 20. Notice that there
                     # are two other quadruplets whose sum is 20:
                     # (7, 9, 1, 3) and (2, 4, 9, 5), but again you’re
                     # asked to return the just one quadruplet (in an
                     # ascending order)
Constraints:

[time limit] 5000ms

[input] array.integer arr

1 ≤ arr.length ≤ 100
[input] integer s

[output] array.integer

*/

import java.io.*;
import java.util.*;

class Solution {
  
  static int[] findArrayQuadruplet(int[] arr, int s) {
    // your code goes here
    /*
    fix 1st elem of arry (m) (n)
    fix 2nd elem of the arry(n) (n)
    left, righ (l,r) (nlogn) 
    
    O(n^3logn)
    
    [2,7,4,0,9,5,1,3]
    [0,1,2,3,4,5,7,9]
    
    [1,2,3,4]
    i = 1
    j = 2
    l = 3
    r = 4
    
    */
    int[] res = new int[4];
    if (arr.length - 3 < 0) {
    int arrN[] = {};
    return arrN;
    }
    Arrays.sort(arr);
   
    for (int i =0; i< arr.length - 3; i++) { // i = 0, i < 1, i = 0
      System.out.println("i" + arr[i]);
      for (int j = i + 1; j < arr.length - 2; j++) {
            System.out.println("j" + arr[j]);// 2
        int l = j + 1; // 3
        int r = arr.length - 1;
        System.out.println("l" + arr[l]);
        System.out.println("r" + arr[r]);// 4
        while ( l < r) { 
          if (arr[i] + arr[j] + arr[l] + arr[r] == s) {
            res[0] = arr[i];
            res[1] = arr[j];
            res[2] = arr[l];
            res[3] = arr[r];
            return res;
          } else if (arr[i] + arr[j] + arr[l] + arr[r] < s) {
            l++;
          } else {
            r--;
          }
        }
      }
      
    }

    int arrN[] = {};
    return arrN;
  }

  public static void main(String[] args) {

  }

}