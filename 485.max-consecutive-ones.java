/*
 * @lc app=leetcode id=485 lang=java
 *
 * [485] Max Consecutive Ones
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int tempCount=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                tempCount++;
            }else{
                if(count<tempCount){
                    count=tempCount;
                }
                tempCount=0;
            }
        }
        if(count<tempCount){
            count=tempCount;
        }
        return count;
    }
}
// @lc code=end

