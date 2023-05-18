/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        String temp;
        for (int i = 0; i < strs.length; i++) {
            temp = shortString(strs[i]);
            map.putIfAbsent(temp, new ArrayList<String>());
            map.get(temp).add(strs[i]);
        }

        List<List<String>> lists = new ArrayList<>();
        map.forEach((arg0, arg1) -> {
            lists.add(arg1);
        });
        return lists;
    }

    public String shortString(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}
// @lc code=end
