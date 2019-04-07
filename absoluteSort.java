/*
Absolute Value Sort

Given an array of integers arr, write a function absSort(arr), that sorts the array according to the absolute values of the numbers in arr. If two numbers have the same absolute value, sort them according to sign, where the negative numbers come before the positive numbers.

Examples:

input:  arr = [2, -7, -2, -2, 0]
output: [0, -2, -2, 2, -7]
Constraints:

[time limit] 5000ms
[input] array.integer arr
0 ≤ arr.length ≤ 10
[output] array.integer
*/

import java.io.*;
import java.util.*;



class Solution {
  static class IntComparator implements Comparator<Integer> {
 
  
  public int compare(Integer i1, Integer i2) {
    
    int ret = Integer.compare(Math.abs(i1),Math.abs(i2));
    if( ret == 0){
      if (i1 == i2) {
        return 0;
      }
      return i1 > i2 ? 1:-1;
    }
    return ret;
  }
}

	static int[] absSort(int[] arr) {
		// your code goes here
    /*
    [2, -7, -2, -2, 0]
    l               r
    [0, -7, -2, -2, 2]
         l          r
    [0, 2, -2, -2, 7]
         l      r
    [0, -2, -2, 2, 7]
    
    hint
    */
    Integer[] newArray = new Integer[arr.length];
    
    for (int i=0; i< arr.length; i++) {
      newArray[i] = Integer.valueOf(arr[i]);
    }
    
    Arrays.sort(newArray,new IntComparator()); // [-7,-2,-2,0,2]
    int[] array = new int[newArray.length];
    for (int i=0; i< newArray.length; i++) {
      array[i] = newArray[i].intValue();
    }
    return array;
	}

	public static void main(String[] args) {
	
	}
}

