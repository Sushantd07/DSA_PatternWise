class Solution {

    int solve(int[] arr,int idx,int[] dp){
        if(idx==0){
            return arr[0];
        }
        if(idx<0){
            return 0;
        }

        if(dp[idx]!=-1){
          return dp[idx];
        }

        int pick = arr[idx] + solve(arr,idx-2,dp);
        int notPick = solve(arr,idx-1,dp);

        dp[idx] = Math.max(pick,notPick);

        return dp[idx];
    }

    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
       

        int prev = nums[0];
        int prev2 =0;



        for(int i=1;i<n;i++){

            int take = nums[i];
            if(i>1){
                take+= prev2;
            }
            int not = prev;

            int cur = Math.max(take,not);

            prev2 = prev;
            prev=cur;
        }

       return prev;
        
    }
}