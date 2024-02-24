package sol_001_two_sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    TwoSum twoSum = new TwoSum();

    @Test
    public void test1() {
        int[] input = new int[] {2,7,11,15};
        int target = 9;
        int[] result = twoSum.twoSum(input, target);
        Assertions.assertArrayEquals(new int[] {0,1}, result);
    }

    @Test
    public void test2() {
        int[] input = new int[] {3,2,4};
        int target = 6;
        int[] result = twoSum.twoSum(input, target);
        Assertions.assertArrayEquals(new int[] {1,2}, result);
    }


    @Test
    public void test3() {
        int[] input = new int[] {3,3};
        int target = 6;
        int[] result = twoSum.twoSum(input, target);
        Assertions.assertArrayEquals(new int[] {0,1}, result);
    }
}