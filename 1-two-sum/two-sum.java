import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> ans = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            int current = nums[i];
            int needed = target - current;

            if(ans.containsKey(needed)) {
                return new int[]{ans.get(needed), i};
            }

            ans.put(current, i);
        }

        return new int[]{};
    }
}