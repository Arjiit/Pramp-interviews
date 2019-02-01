/*
Bracket Match

A string of brackets is considered correctly matched if every opening bracket in the string can be paired up with a later closing bracket, and vice versa. For instance, “(())()” is correctly matched, whereas “)(“ and “((” aren’t. For instance, “((” could become correctly matched by adding two closing brackets at the end, so you’d return 2.

Given a string that consists of brackets, write a function bracketMatch that takes a bracket string as an input and returns the minimum number of brackets you’d need to add to the input in order to make it correctly matched.

Explain the correctness of your code, and analyze its time and space complexities.

Examples:

input:  text = “(()”
output: 1

input:  text = “(())”
output: 0

input:  text = “())(”
output: 2
Constraints:

[time limit] 5000ms

[input] string text

1 ≤ text.length ≤ 5000
[output] integer

*/

import java.io.*;
import java.util.*;
/*

 1. Talk out loud!
 2. Clarifying questions!
 3. Write some test cases to make sure you understand the question properly
 4. Add Sanity checks in the beginning of the methods
 5. Use interfaces while defining data structures
 6. Manually run through some test cases
 
*/

class Solution {
  
  static int bracketMatch(String text) {
    // your code goes here
    Stack<Character> s = new Stack<Character>();
    int count = 0; // for ) 
    for (int i=0; i< text.length(); i++) {
      
      if (text.charAt(i) == '(') {
        s.push(text.charAt(i));
      } else if (!s.isEmpty() && text.charAt(i) == ')') {
        s.pop();
      } else if (s.isEmpty() && text.charAt(i) == ')') {
        count++;
      }
    }
    
    return s.size() + count;
    
    /*
 
    
    (
    
    push that into stack
    
    )
    pop it from stack
    
    if size of stack is 0 && ) -> count++
    
    size of stack - result
    result + count
    
    ())))(
    ())))
    stack - 1, (
    stack - 0, )
    1
    2
    3
    result = 0 + 3
    */
  }

  public static void main(String[] args) {

  }

}