/*
Question ->
  
Given two strings which are of lengths n and n+1. The second string contains all the character of the first string, but there is one extra character. Your task to find the extra character in the second string. 

Example 1:

Input:
s1 = abcd
s2 = badce
Output: 
e
Example 2:

Input:
s1 = efg
s2 = gtfe
Output: 
t
Your Task:

You only need to complete the function extraChar() that takes s1 and s2 as parameters and returns that extra character. 
*/

Solution -> 
  public static char extraChar(String s1, String s2){

    //write your code here

    char[] arr1 = s1.toCharArray();
    char[] arr2 =  s2.toCharArray();
    
    Arrays.sort(arr2);
    Arrays.sort(arr1);
    
    for(int i=0; i<arr1.length; i++){
        if(arr1[i] != arr2[i]){
            return arr2[i];
        }
    }
    return arr2[arr2.length-1];
}
