/*

H-Tree Construction

An H-tree is a geometric shape that consists of a repeating pattern resembles the letter “H”.

It can be constructed by starting with a line segment of arbitrary length, drawing two segments of the same length at right angles to the first through its endpoints, and continuing in the same vein, reducing (dividing) the length of the line segments drawn at each stage by √2.

Here are some examples of H-trees at different levels of depth:

alt depth = 1

alt depth = 2

alt depth = 3

Write a function drawHTree that constructs an H-tree, given its center (x and y coordinates), a starting length, and depth. Assume that the starting line is parallel to the X-axis.

Use the function drawLine provided to implement your algorithm. In a production code, a drawLine function would render a real line between two points. However, this is not a real production environment, so to make things easier, implement drawLine such that it simply prints its arguments (the print format is left to your discretion).

Analyze the time and space complexity of your algorithm. In your analysis, assume that drawLine's time and space complexities are constant, i.e. O(1).

Constraints:

[time limit] 5000ms

[input] double x

[input] double y

[input] double length

[input] double depth

0 ≤ depth ≤ 10
*/


import java.util.*;

class Main {
  static public void main( String args[] ) {
    System.out.println( "Practice makes Perfect!" );
  }
  
  private static void drawHTree(int x, int y, int length, int depth) {
  // TO_DO
  /*
  One horizontal line
  Two vertical lines perpendicular the horizontal line
  if (depth == 0) {
  return;
  }
  
  (x,y) is mid of the horizontal line.
  drawLine(x + length/2,y) (x,y) & drawLine(x - length/2, y) (x,y) // Horizontal line
  
  (x + length/2,y) (x + length/2,y + length/2) & drawLine(x + length/2,y) (x + length/2,y - length/2) // vertical line on right
  
  (x - length/2,y) (x - length/2,y + length/2) & drawLine(x - length/2,y) (x - length/2,y - length/2) // vertical line on left
  
 int top_left = x - length/2;
 int top_right = x + length/2;
 int bottom_left = x - length/2;
 int bottom_right = x + length/2;
 
 int top_left_y = y + length/2;
 int top_right_y = y + length/2;
 int bottom_left_y = y - length/2;
 int bottom_right_y = y - length/2;
 

  */
    
   if (depth == 0) {
     return;
   }
    
    int x0 = x - length/2;
    int x1 = x + length/2;
    int y0 = y - length/2;
    int y1 = y + length/2;
    
    // left vertical
    //right vertical
    //horizontal
    
    //update length by root(2)
    
    //recursive calls for 4 edge points
    
    
 int top_left = x - length/2;
 int top_right = x + length/2;
 int bottom_left = x - length/2;
 int bottom_right = x + length/2;
 
 int top_left_y = y + length/2;
 int top_right_y = y + length/2;
 int bottom_left_y = y - length/2;
 int bottom_right_y = y - length/2;
    
    drawLine(x, y, x + length/2, y); // mid to right horizontal
    drawLine(x, y, x - length/2, y); // mid to left horizontal
    drawLine(x + length/2, y + length/2, x + length/2, y - length/2); // vertical line on right from top to bottom
    drawLine(x - length/2, y + length/2, x - length/2, y - length/2); // vertical on left
    
    drawHTree(top_left, top_left_y, length/(2)^(0.5), depth - 1);
    drawHTree(top_right, top_right_y, length/(2)^(0.5), depth - 1);
    drawHTree(bottom_left, bottom_left_y, length/(2)^(0.5), depth - 1);
    drawHTree(bottom_right, bottom_right_y, length/(2)^(0.5), depth - 1);
    
  }
  
  // Assume this as an in-build function to draw a line
  private static void drawLine(int x1, int y1, int x2, int y2);
}

