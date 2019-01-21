/*Given two sorted arrays arr1 and arr2 of passport numbers, implement a function findDuplicates that returns an array of all passport numbers that are both in arr1 and arr2. Note that the output array should be sorted in an ascending order.

Let N and M be the lengths of arr1 and arr2, respectively. Solve for two cases and analyze the time & space complexities of your solutions: M ≈ N - the array lengths are approximately the same M ≫ N - arr2 is much bigger than arr1.

Example:

input:  arr1 = [1, 2, 3, 5, 6, 7], arr2 = [3, 6, 7, 8, 20]

output: [3, 6, 7] # since only these three values are both in arr1 and arr2
Constraints:

[time limit] 5000ms

[input] array.integer arr1

1 ≤ arr1.length ≤ 100
[input] array.integer arr2

1 ≤ arr2.length ≤ 100
[output] array.integer

*/

import java.io.*;
import java.util.*;

class Solution {

  static int[] findDuplicates(int[] arr1, int[] arr2) {
    // your code goes here
    /*
    [1, 2, 3, 5, 6, 7],
    [3, 6, 7, 8, 20]

    [3]
    A = 1 .... 100000
    B = 1 2 100001

    N + M
    */
    
 

    
    List<Integer> res = new ArrayList<>();
   
    for (int i=0; i< arr2.length; i++) {
    int start = 0;
    int end = arr1.length - 1;
    int mid = (start + end)/2;
    System.out.println(arr1[mid]);
      while (start <= end) {
        if (arr1[mid] == arr2[i]) {
          res.add(arr2[i]);
          break;
        } else if ( arr1[mid] > arr2[i]) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
        System.out.println("start" + start);
        System.out.println("end" + end);
        
        mid = (start + end)/2;
      }
    }
    int[] resArr = new int[res.size()];
    for (int i = 0; i < res.size(); i++) {
      resArr[i] = res.get(i);
    }
    
    return resArr;
  }

  public static void main(String[] args) {

  }

}