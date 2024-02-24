package sol_001_two_sum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/two-sum
public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, List<Integer>> lookup = new HashMap<>();
            for(int i = 0; i < nums.length; i++) {
                int curr = nums[i];
                List<Integer> list = lookup.getOrDefault(curr, new ArrayList<>());
                list.add(i);
                lookup.put(curr, list);
            }

            for(int i = 0; i < nums.length; i++) {
                int curr = nums[i];
                int key = target - curr;
                List<Integer> list = lookup.get(key);
                if(list != null) {
                    for(int j = 0; j < list.size(); j++) {
                        if(list.get(j) == i) {
                            continue;
                        }
                        return new int[] {i, list.get(j)};
                    }
                }
            }
            return new int[2];
        }
}
