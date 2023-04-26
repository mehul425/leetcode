/*
 * @lc app=leetcode id=1295 lang=java
 *
 * [1295] Find Numbers with Even Number of Digits
 */

// @lc code=start
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (Math.floor(Math.log10(nums[i]) + 1) % 2 == 1) {
                count++;
            }
        }
        return count;
    }
}
// @lc code=end
