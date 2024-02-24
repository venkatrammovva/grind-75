package sol_009_flood_fill;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloodFillTest {

    FloodFill floodFill = new FloodFill();

    @Test
    public void test1() {
        int[][] input = new int[][]{{1,1,1},{1,1,0},{1,0,1}};
        int[][] expected = new int[][] {{2,2,2},{2,2,0},{2,0,1}};

        Assertions.assertArrayEquals(expected, floodFill.floodFill(input, 1, 1, 2));
    }

    @Test
    public void test2() {
        int[][] input = new int[][]{{0,0,0},{0,0,0}};
        int[][] expected = new int[][] {{0,0,0},{0,0,0}};

        Assertions.assertArrayEquals(expected, floodFill.floodFill(input, 1, 1, 0));
    }

}