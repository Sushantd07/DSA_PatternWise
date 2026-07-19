class Solution {

    public boolean fun(int[] arr,int limit,int k){
        int sum=0;
        int sa=1;

        for(int i=0;i<arr.length;i++){
            if(sum+arr[i] <= limit){
                sum = sum + arr[i];
            }else{
                sa++;
                sum = arr[i];
                if(sa>k){
                    return false;
                }
            }
        }

        return true;
    }
    public int splitArray(int[] nums, int k) {

        int sum=0,max=nums[0];
        int n=nums.length;

        if(n<k){
            return -1;
        }

        for(int i=0;i<n;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            sum+=nums[i];
        }

        int low=max,high=sum;
        int res=-1;

        while(low<=high){
            int guess = low + (high-low)/2;
            

            if(fun(nums,guess,k)){
                res = guess;
                high = guess-1;
            }else{
                low = guess+1;
            }
        }

        return res;
        
    }
}