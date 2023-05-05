/*
 * @lc app=leetcode id=1089 lang=java
 *
 * [1089] Duplicate Zeros
 */

// @lc code=start
class Solution {
    public void duplicateZeros(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - count; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }

        for (int i = arr.length - 1; count > 0 && i > 0; i--) {
            if (arr[i - count] == 0) {
                arr[i] = 0;
                if (i != arr.length) {
                    arr[--i] = 0;
                }
                count--;
            } else {
                arr[i] = arr[i - count];
            }
        }
    }
}
// @lc code=end
