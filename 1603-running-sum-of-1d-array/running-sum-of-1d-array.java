class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int original=0;
         for(int i=0;i<nums.length;i++){
            
            ans[i]=nums[i]+original;
            original=ans[i];


         }
         return ans;
    }
}