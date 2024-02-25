package sol_014_first_bad_version;


// https://leetcode.com/problems/first-bad-version/
public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int l = 1, r = n;
        int result = Integer.MAX_VALUE;

        while(l <= r) {
            int mid = l + ((r-l) / 2);

            if(isBadVersion(mid)) {
                result = Math.min(result, mid);
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return result;
    }

    private boolean isBadVersion(int x) {
        return false;
    }
}
