/**
*Author: aschkun [https://github.com/aschkun];
*Link of the question is mentioned below
*https://leetcode.com/problems/number-of-good-pairs/
**/


class Solution {
    public int numIdenticalPairs(int[] nums) {
         int count = 0;
        for(int i = 0; i < nums.length - 1; i++){
           
           for(int j = i+1;j < nums.length ; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
