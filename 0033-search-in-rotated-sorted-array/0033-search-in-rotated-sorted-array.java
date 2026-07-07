class Solution {

    int binarySearch(int start,int end,int[] arr,int target){
        int low=start,high=end,ans=-1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(arr[mid]>target){
                high=mid-1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                return mid;
            }
        }
      
      return -1;

    }
    public int search(int[] nums, int target) {

        int low=0,high=nums.length-1,n=nums.length-1,pivot=-1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(nums[mid]>nums[n]){
                low=mid+1;
            }else{
                pivot=mid;
                high = mid-1;
            }
        }

        int ans = -1;

        int fh = binarySearch(0,pivot-1,nums,target);
        int sh = binarySearch(pivot,nums.length-1,nums,target);
       
        if(fh==-1){
            return sh;
        }else if(sh == -1){
            return fh;
        }

        return -1;

    }
}