/*
 * @lc app=leetcode id=485 lang=java
 *
 * [485] Max Consecutive Ones
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int tempCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                tempCount++;
            } else {
                count = Math.max(count, tempCount);

                tempCount = 0;
            }
        }
        count = Math.max(count, tempCount);
        return count;
    }
}
// @lc code=end