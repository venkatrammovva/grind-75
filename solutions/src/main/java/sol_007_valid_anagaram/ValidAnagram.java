package sol_007_valid_anagaram;

import java.util.Arrays;

//https://leetcode.com/problems/valid-anagram/
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] fs = buildFreq(s);
        int[] ft = buildFreq(t);

        for(int i = 0; i < 26; i++) {
            if(fs[i] != ft[i])
                return false;
        }
        return true;
    }

    private int[] buildFreq(String s) {
        int[] freq = new int[26];
        Arrays.fill(freq, 0);
        for(int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            freq[c]++;
        }
        return freq;
    }
}
