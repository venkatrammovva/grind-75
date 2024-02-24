package sol_005_valid_palindrome;


// https://leetcode.com/problems/valid-palindrome/
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        if(s == null || s.length() <= 1) return true;
        int l = moveNext(s, -1, 1); int r = moveNext(s, s.length(), -1);
        while(l <= r) {
            if(s.charAt(l) != s.charAt(r))
                return false;
            l = moveNext(s, l, 1);
            r = moveNext(s, r, -1);
        }
        return true;
    }

    private int moveNext(String s, int curr, int step) {
        int start = curr + step;
        while(start >= 0 && start < s.length()) {
            char currChar = s.charAt(start);
            if(Character.isAlphabetic(currChar) || Character.isDigit(currChar)) {
                return start;
            }
            start += step;
        }
        return start;
    }
}
