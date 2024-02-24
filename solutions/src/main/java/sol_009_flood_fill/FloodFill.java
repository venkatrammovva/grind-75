package sol_009_flood_fill;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/flood-fill/
public class FloodFill {
    public record Item(int r, int c) {
    }

    private int[][] ns = new int[][]{{0, -1}, {-1, 0}, {1, 0}, {0, 1}};

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int rn = image.length, cn = image[0].length;
        Item start = new Item(sr, sc);
        Queue<Item> q = new LinkedList<>();
        boolean[][] visited = new boolean[rn][cn];
        for (int i = 0; i < rn; i++) {
            Arrays.fill(visited[i], false);
        }
        int startingColor = image[sr][sc];
        q.add(start);
        while (!q.isEmpty()) {
            Item curr = q.remove();
            image[curr.r()][curr.c()] = color;
            visited[curr.r()][curr.c()] = true;
            for (int[] n : ns) {
                int newRow = n[0] + curr.r();
                int newCol = n[1] + curr.c();

                if (!isInBounds(newRow, newCol, rn, cn) || visited[newRow][newCol] || image[newRow][newCol] != startingColor) {
                    continue;
                }
                q.add(new Item(newRow, newCol));
            }
        }

        return image;
    }

    private boolean isInBounds(int r, int c, int rn, int cn) {
        return r >= 0 && c >= 0 && r < rn && c < cn;
    }
}
