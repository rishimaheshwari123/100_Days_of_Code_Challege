/*
Question - >

Given an array of integers nums, half of the integers in nums are odd, and the other half are even.

Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.

Return any answer array that satisfies this condition.

 

Example 1:

Input: nums = [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
Example 2:

Input: nums = [2,3]
Output: [2,3]
 

Constraints:

2 <= nums.length <= 2 * 104
nums.length is even.
Half of the integers in nums are even.
0 <= nums[i] <= 1000
  
  
  
Logic ->
      In this challenge we are sorting a array in form of even and odd  , first we create a variable even initilize to 0 and another variable is odd is initilize to,
      1 then run a loop in this loop we chack the condition if our element is even then put it in the first position in increament the value of even by 2 else our element
      is odd then store second position and increment the value of odd by 2 and return new array.
  
*/
        
Solution ->
  
  class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int even = 0, odd = 1;
        int[] arr = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                arr[even] = nums[i];
                even += 2;
            }
                else{
                   arr[odd] = nums[i]; 
                   odd += 2;
                }
            }
        return arr;
        }
    
}
