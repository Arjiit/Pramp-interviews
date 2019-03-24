/*
Given two words source and target, and a list of words words, find the length of the shortest series of edits that transforms source to target.

Each edit must change exactly one letter at a time, and each intermediate word (and the final target word) must exist in words.

If the task is impossible, return -1.

Examples:

source = "bit", target = "dog"
words = ["but", "put", "big", "pot", "pog", "dog", "lot"]

output: 5
explanation: bit -> but -> put -> pot -> pog -> dog has 5 transitions.
source = "no", target = "go"
words = ["to"]

output: -1
*/

import java.io.*;
import java.util.*;

class Solution {

  
  // "bit" -> ("big", "but")
  // "but" -> ("put", bit")
  // "pot" -> ("pog", ...)
  // ...
  
  public static boolean doDiffer(String word1, String word2) {
    int count = 0;
 
    for (int i=0; i<word1.length(); i++) {
      if(word1.charAt(i) != word2.charAt(i)) {
        count++;
      }
    }
    return count == 1 ? true:false;
  }
  
  

	static int shortestWordEditPath(String source, String target, String[] words) {
		// your code goes here
    
    HashMap<String, List<String>> wordMap = new HashMap<>();
    
    if (source.length() != target.length()){
      return -1;
    }
    
    List<String> wordsList = new ArrayList<>();
    for(int i=0; i < words.length; i++) {
      if(doDiffer(source,words[i])) {
        wordsList.add(words[i]);
      }
    }
    wordMap.put(source, wordsList);
    
    for (int i=0; i<words.length; i++) {
      List<String> wordsList2 = new ArrayList<>();
      for (int j=0; j<words.length; j++) {
        if (doDiffer(words[i], words[j])){
          wordsList2.add(words[j]);
        }
      }
      wordMap.put(words[i], wordsList2);
    }
    Set<String> hs = new HashSet<>();
    Queue<Node> q = new LinkedList<>();
    Node n = new Node(source,0);
    q.add(n);
    hs.add(n.word);
  
    while(q.size() > 0) {
      Node finalWord = q.poll();
      
      if (finalWord.word == target) {
        return finalWord.lev;
      }
      
      List<String> stringMap = wordMap.get(finalWord.word);
      for(int i=0; i< stringMap.size(); i++) {
        Node x = new Node(stringMap.get(i), finalWord.lev + 1);
        if (!hs.contains(x.word)) {
          hs.add(x.word);
          q.add(x);
        }
      }
    }
    return -1;
	}
  
  
  private static class Node {
    String word;
    int lev;
    
    public Node(String word, int lev) {
      this.word = word;
      this.lev = lev;
    }

  }
  
  

	public static void main(String[] args) {
	
	}
}
