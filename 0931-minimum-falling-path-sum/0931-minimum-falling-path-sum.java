class Solution {
    int solve(int i,int j,int[][] arr,int[][] dp){

        if(j<0 || j>=arr.length){
            return Integer.MAX_VALUE;
        }

        if(i == arr.length-1){
            return arr[i][j];
        }

        if(dp[i][j] != Integer.MAX_VALUE){
            return dp[i][j];
        }

        int down = solve(i+1,j,arr,dp);
        int left = solve(i+1,j-1,arr,dp);
        int right = solve(i+1,j+1,arr,dp);

        return dp[i][j] = arr[i][j] + Math.min(down,Math.min(left,right));
    }
    public int minFallingPathSum(int[][] matrix) {

        int n = matrix.length;

        int[][] dp = new int[n][n];

        for(int j=0;j<n;j++){
           dp[n-1][j] = matrix[n-1][j];
        }

         for (int i = n - 2; i >= 0; i--) {

            for (int j = 0; j < n; j++) {

                int down = dp[i + 1][j];

               int left = Integer.MAX_VALUE;
                if (j > 0) {
                    left = dp[i + 1][j - 1];
                }

                
               int right = Integer.MAX_VALUE;
                if (j < n - 1) {
                   right = dp[i + 1][j + 1];
                }

                dp[i][j] = matrix[i][j]
                         + Math.min(down, Math.min(left, right));
            }
        }
        int ans = Integer.MAX_VALUE;

        for(int j=0;j<n;j++){
            ans = Math.min(ans,dp[0][j]);
        }
        
        return ans;
        
    }
}