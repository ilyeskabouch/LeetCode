// Given a string s, find the length of the longest substring without repeating characters.
class Solution {
    public int lengthOfLongestSubstring(String s) {

        int[] map = new int[128];
        int start = 0;
        int end = 0;
        int maxLen = 0;

        while (end < s.length()) {

            char c = s.charAt(end);
            map[c]++;

            while (map[c] > 1) {

                char temp = s.charAt(start);
                map[temp]--;
                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1);
            end++;
        }

        return maxLen;
    }
}