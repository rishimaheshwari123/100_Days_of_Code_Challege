/*
Question ->
  Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

 

Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2]
 

Constraints:

1 <= nums.length <= 5 * 104
-109 <= nums[i] <= 109
  
  */

Solution ->
  class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (!hm.containsKey(nums[i])){
                hm.put(nums[i],1);
            }else{
                hm.put(nums[i],hm.get(nums[i])+1);
            }
        }
        List<Integer> list=new ArrayList<>();
        int x=nums.length;
        for (Map.Entry m:hm.entrySet()){
            int value=(Integer)m.getValue();
            int key=(Integer)m.getKey();
            if (value > x/3) list.add(key);
        }
        return list;
    }
}
