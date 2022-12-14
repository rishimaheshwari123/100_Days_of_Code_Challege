/*
Question ->
  
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must be unique and you may return the result in any order.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 

Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
  
  
Logic -> 
  In this challenge we use HashSet , first we copy all element of nums1 in set then we create another HashSet in this set we chack if first set contains ,
  the element then only add in this set  then we create a array and store the all value of interection in array and return arr.
  
*/
Solution ->
  
  class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set =  new HashSet<Integer>();
        for(int i : nums1){
            set.add(i);
        }
        HashSet<Integer> intersection =  new HashSet<Integer>();
        for(int i : nums2){
            if(set.contains(i)){
                intersection.add(i);
            }
        }
        int[] arr = new int[intersection.size()];
        int idx = 0;
        for(int i : intersection){
            arr[idx++] =  i;
        }
        return arr;
    }
}
