package sol_015_ransom_note;

import java.util.Arrays;


// https://leetcode.com/problems/ransom-note

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] rArr = new int[26];
        Arrays.fill(rArr, 0);
        for(char c : ransomNote.toCharArray()) {
            rArr[c - 'a']++;
        }
        int count = ransomNote.length();


        for(char c: magazine.toCharArray()) {
            int ci = c - 'a';
            if(rArr[ci] > 0) {
                rArr[ci]--;
                count--;

                if(count == 0) return true;
            }
        }

        return false;
    }
}
