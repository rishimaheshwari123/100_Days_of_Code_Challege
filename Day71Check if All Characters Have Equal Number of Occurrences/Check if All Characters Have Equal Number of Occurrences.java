/*
Question -> 
  
Given a string s, return true if s is a good string, or false otherwise.

A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).

 

Example 1:

Input: s = "abacbc"
Output: true
Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.
Example 2:

Input: s = "aaabb"
Output: false
Explanation: The characters that appear in s are 'a' and 'b'.
'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.
 

Constraints:

1 <= s.length <= 1000
s consists of lowercase English letters.
  
 */
  
  Solution -> 
  
  class Solution {
    public boolean areOccurrencesEqual(String s) {
    HashMap<Character, Integer> map = new HashMap<>();
    for(char num : s.toCharArray()){
        map.put(num,map.getOrDefault(num,0)+1);
    }  
    int temp = map.get(s.charAt(0));
    for(int i = 1; i<s.length(); i++){
        if(temp!=map.get(s.charAt(i))){
            return false;
        }
    }
    return true;
    }
}
