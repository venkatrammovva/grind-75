package sol_005_valid_palindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sol_002_valid_paranthesis.ValidParentheses;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    public void test() {
        Assertions.assertTrue(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
        Assertions.assertTrue(validPalindrome.isPalindrome(" "));
        Assertions.assertFalse(validPalindrome.isPalindrome("race a car"));
    }

}