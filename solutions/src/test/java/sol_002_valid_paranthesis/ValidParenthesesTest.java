package sol_002_valid_paranthesis;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    ValidParentheses vp = new ValidParentheses();

    @Test
    public void test1() {
        Assertions.assertTrue(vp.isValid("()"));
    }

    @Test
    public void test2() {
        Assertions.assertTrue(vp.isValid("()[]{}"));
    }

    @Test
    public void test3() {
        Assertions.assertFalse(vp.isValid("(]"));
        Assertions.assertFalse(vp.isValid("]"));
        Assertions.assertFalse(vp.isValid("(})"));
    }
}