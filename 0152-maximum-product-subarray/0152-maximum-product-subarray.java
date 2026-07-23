class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;

        int minending = nums[0];
        int maxending = nums[0];
        int ans = nums[0];

        for(int i=1;i<n;i++){
           int v1 = nums[i];
           int v2 = minending*nums[i];
           int v3 = maxending*nums[i];

           maxending = Math.max(v1,Math.max(v2,v3));
           minending = Math.min(v1,Math.min(v2,v3));
           ans = Math.max(ans,Math.max(maxending,minending));
        }

        return ans;
    }
}