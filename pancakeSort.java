/*
Given an array of integers arr:

Write a function flip(arr, k) that reverses the order of the first k elements in the array arr.
Write a function pancakeSort(arr) that sorts and returns the input array. You are allowed to use only the function flip you wrote in the first step in order to make changes in the array.
Example:

input:  arr = [1, 5, 4, 3, 2]

output: [1, 2, 3, 4, 5] # to clarify, this is pancakeSort's output
Analyze the time and space complexities of your solution.

Note: it’s called pancake sort because it resembles sorting pancakes on a plate with a spatula, where you can only use the spatula to flip some of the top pancakes in the plate. To read more about the problem, see the Pancake Sorting Wikipedia page.

Constraints:

[time limit] 5000ms

[input] array.integer arr

[input] integer k

0 ≤ k
[output] array.integer

*/

import java.io.*;
import java.util.*;

class Solution {

  static int[] pancakeSort(int[] arr) {
    // your code goes here
    // [1, 5, 4, 3, 2]
    // k = 4
    // [3, 4, 5, 1, 2]
    /* [1, 5, 4, 3, 2]
       [5, 1, 4, 3, 2]
       [2, 3, 4, 1, 5]
       
       [1,4,3,2,5]
       [4,1,3,2,5]
       [2,3,1,4,5]
       [3,2,1,4,5]
       [1,2,3,4,5]
       
       
       [3,1,2,4,6,5]
       [6,4,2,1,3,5]
       [5,3,1,2,4,6]
 
    */
    int count = 0;
    
    while ( count < arr.length - 1) {
    int maxE = maxElement(arr,arr.length - count); // 
        System.out.println("maxE " + maxE);
        flip(arr,maxE + 1); // [6,4,2,1,3,5]
        print(arr);
        flip(arr, arr.length - count); // []
        print(arr);
        count ++;
    }
    
    
    return arr;
  }
  
  static int maxElement(int[] arr, int k) {
    int max = 0;
    for (int i=0; i< k; i++) {
      if (arr[i] > arr[max]) {
        max = i; //4
      }
    }
    return max;
  }
  
  static int[] flip(int[] arr, int k) {
    int s = 0;
    int e = k - 1; //4
    System.out.println("end" + e);
    while ( s < e) {
      int temp = arr[s];
      arr[s] = arr[e];
      arr[e] = temp;
      s++;
      e--;
    }
    
  
    return arr; 
  }

  public static void main(String[] args) {

  }
  
  static void print(int[] array) {
		System.out.println();
		for (int n : array) {
			System.out.print(n + "  ");
		}
		System.out.println();
	}

}