class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int curr=nums[0];
        int maxs=nums[0];
        for(int i=1;i<n;i++){
            curr=Math.max(nums[i], curr+ nums[i]);
            maxs=Math.max(curr, maxs);
        }
        return maxs;

      
        
    }
}