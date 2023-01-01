/*
Question -> 

Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

 

Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Example 2:

Input: pattern = "abba", s = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false
 

Constraints:

1 <= pattern.length <= 300
pattern contains only lower-case English letters.
1 <= s.length <= 3000
s contains only lowercase English letters and spaces ' '.
s does not contain any leading or trailing spaces.
All the words in s are separated by a single space.
*/

Solution -> 

  class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map =  new HashMap<>();
        String[] str = s.split(" ");
        if(str.length != pattern.length()) return false;

        for(int i=0; i<pattern.length(); i++){
            char a = pattern.charAt(i);
            if(!map.isEmpty() && map.containsKey(a) && !map.get(a).equals(str[i])) return false;
            if(!map.isEmpty() && map.containsKey(a) && map.get(a).equals(str[i])) continue;
            if(!map.isEmpty() && map.containsValue(str[i])) return false;

            map.put(a,str[i]);
        }
        return true;
    }
}
