package sol_017_longest_palindrome;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        for(Character c: s.toCharArray()) {
            int count = freq.getOrDefault(c, 0) + 1;
            freq.put(c, count);
        }
        boolean isOddTaken = false;
        int result = 0;
        for(Integer v: freq.values()) {
            result += (v%2 == 0 ? v : v-1);
            if(!isOddTaken && v %2 == 1) {
                isOddTaken = true;
                result++;
            }
        }
        return result;
    }
}
