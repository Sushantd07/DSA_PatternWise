class Solution {
    public int findMin(int[] nums) {
        int low=0,high=nums.length-1,n=nums.length,ans=0;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(nums[mid]>nums[n-1]){
                low=mid+1;
            }else{
                ans = nums[mid];
                high = mid-1;
            }
        }

        return ans;
    }
}