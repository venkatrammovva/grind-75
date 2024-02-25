package sol_019_binary_addition;

import org.junit.jupiter.api.Test;
import sol_020_binary_addition.BinaryAddition;

import static org.junit.jupiter.api.Assertions.*;

class BinaryAdditionTest {

    BinaryAddition binaryAddition = new BinaryAddition();

    @Test
    public void test1() {
        assertEquals("100", binaryAddition.addBinary("11", "1"));
    }

}