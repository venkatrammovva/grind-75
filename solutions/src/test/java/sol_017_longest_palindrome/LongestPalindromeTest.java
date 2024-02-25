package sol_017_longest_palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromeTest {

    LongestPalindrome longestPalindrome = new LongestPalindrome();

    @Test
    public void test1() {
        assertEquals(7, longestPalindrome.longestPalindrome("abccccdd"));
        assertEquals(1, longestPalindrome.longestPalindrome("a"));
    }

}