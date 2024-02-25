package sol_019_majority_element;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int ele = nums[0], count = 1;

        for(int i = 1; i < nums.length; i++) {
            int curr = nums[i];

            if(ele == curr) {
                count++;
            } else {
                count--;
                if(count == -1) {
                    ele = curr;
                    count = 1;
                }
            }
        }
        return ele;
    }
}
