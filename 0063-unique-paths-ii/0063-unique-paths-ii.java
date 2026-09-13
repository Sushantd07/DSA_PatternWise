class Solution {
       int solve(int i,int j,int[][] dp,int[][] arr){
        
        if(i<0 || j<0){
            return 0;
        }
        if(arr[i][j] == 1){
            return 0;
        }
        if(i==0 && j==0){
            return 1;
        }
       
        
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int up = solve(i-1,j,dp,arr);
        int left = solve(i,j-1,dp,arr);

         return dp[i][j] = up+left;

         
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        
        
        int[][] dp = new int[m][n];

       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){

            if(obstacleGrid[i][j] == 1){
                dp[i][j] = 0;
                continue;
            }

            if(i==0 && j==0){
                dp[i][j] = 1;
                continue;
            }
            int up = 0;
int left = 0;

             if(i>0){
                      up = dp[i-1][j];
                }
                if(j>0){
                  left = dp[i][j-1];
                }
                dp[i][j] = up + left;
        }
       }
    return dp[m-1][n-1];
        
    }
}