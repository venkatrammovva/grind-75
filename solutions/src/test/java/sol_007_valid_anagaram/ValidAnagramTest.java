package sol_007_valid_anagaram;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ValidAnagramTest {
    ValidAnagram validAnagram = new ValidAnagram();

    @Test
    public void test1() {
        Assertions.assertTrue(validAnagram.isAnagram("anagram", "nagaram"));
        Assertions.assertFalse(validAnagram.isAnagram("rat", "car"));
    }
}