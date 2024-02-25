package sol_016_climbing_stairs;

//https://leetcode.com/problems/climbing-stairs/
public class ClimbingStairs {
    public int climbStairs(int n) {
        if(n <= 2) return n;
        int prev = 2, pPrev = 1;
        for(int i = 2; i < n; i++) {
            int sum = prev + pPrev;
            pPrev = prev;
            prev = sum;
        }
        return prev;
    }
}
