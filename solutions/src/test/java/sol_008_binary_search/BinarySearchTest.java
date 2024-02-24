package sol_008_binary_search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    BinarySearch binarySearch = new BinarySearch();

    @Test
    public void test() {
        Assertions.assertEquals(4, binarySearch.search(new int[] {-1,0,3,5,9,12}, 9));
        Assertions.assertEquals(-1, binarySearch.search(new int[] {-1,0,3,5,9,12}, 2));
    }

}