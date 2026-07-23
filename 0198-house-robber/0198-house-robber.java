class Solution {

    public int fun(int[] arr,int n,int idx,int free,int[][] dp){
        if(idx==n) return 0;

        if(free==0){
            return fun(arr,n,idx+1,1,dp);
        }

        if(dp[idx][free] != -1){
            return dp[idx][free];
        }

        int c1 = arr[idx] + fun(arr,n,idx+1,0,dp);
        int c2 = fun(arr,n,idx+1,1,dp);

       int ans = Math.max(c1,c2);

       dp[idx][free] = ans;

       return ans;
    }
    public int rob(int[] nums) {
        int n = nums.length;

        int[][] dp = new int[nums.length][2];

        for(int i=0;i<nums.length;i++){
            Arrays.fill(dp[i],-1);
        }

        return fun(nums,n,0,1,dp);
    }
}