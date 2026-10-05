import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> ans = new HashMap<>();
        ArrayList<Integer> output = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++){
            ans.put(nums1[i], i);
        }

        for(int i = 0; i < nums2.length; i++){
            if(ans.containsKey(nums2[i]) && !output.contains(nums2[i])){
                output.add(nums2[i]);
            }
        }

        int[] result = new int[output.size()];

        for(int i = 0; i < output.size(); i++){
            result[i] = output.get(i);
        }

        return result;
    }
}