package sol_019_majority_element;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {
    MajorityElement majorityElement = new MajorityElement();

    @Test
    public void test() {
        assertEquals(3, majorityElement.majorityElement(new int[] {3,2,3}));
        assertEquals(2, majorityElement.majorityElement(new int[] {2,2,1,1,1,2,2}));
    }
}