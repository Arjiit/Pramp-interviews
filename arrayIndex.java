/*
Given a sorted array arr of distinct integers, write a function indexEqualsValueSearch that returns the lowest index i for which arr[i] == i. Return -1 if there is no such index. Analyze the time and space complexities of your solution and explain its correctness.

Examples:

input: arr = [-8,0,2,5]
output: 2 # since arr[2] == 2

input: arr = [-1,0,3,6]
output: -1 # since no index in arr satisfies arr[i] == i.
Constraints:

[time limit] 5000ms

[input] array.integer arr

1 ≤ arr.length ≤ 100
[output] integer

*/

import java.io.*;
import java.util.*;

class Solution {
  
  // [-8,0,2,3,4,5,15]
  //   0,1,2,3,4,5,6
  
  // cut right  high = mid
  // cut left low = mid
  /*
  1. num == i high = mid, low = 0;
  2. num < i low = mid + 1, high = end
  3. num > i low = 0, high = mid - 1
  
  
  low = 0;
  high = arr.length - 1;
  
  while (l < r)
  mid = 1, arr[mid] = 0
  mid == arr[mid], return mid;
  mid > arr[mid]; l = mid+1;
  
  [-1,0,3,6]
  l = 0, h = 3, m = 1
  arr[1] < 1, l = 2, h = 3, m = 2
  arr[2] > 2, h = 1, l = 2 (arr[2] == 2)
  
  */
  
  static int indexEqualsValueSearch(int[] arr) {
    // your code goes here
    int low = 0;
    int high = arr.length - 1;
    int mid = low + (high - low)/2;
    while (low < high) {
      
      System.out.println(arr[mid]);
      if (arr[mid] == mid) {
        high = mid;
      } else if (arr[mid] < mid) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
      mid = low + (high - low)/2;
    }
   return arr[mid] == mid ? mid : -1;
  }

  public static void main(String[] args) {

  }

}