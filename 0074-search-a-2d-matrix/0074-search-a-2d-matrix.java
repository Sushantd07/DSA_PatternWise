class Solution {
    int findrow(int[][] matrix,int target){
        int m= matrix.length;
        int n = matrix[0].length;

        int low=0,high=m-1;
        int row=-1;

        while(low<=high){
            int guess = low + (high-low)/2;

            if(target < matrix[guess][0]){
                high = guess-1;
            }else if(target > matrix[guess][0]){
                low = guess+1;
            }else{
                return guess;
            }
        }

        return -1;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

       
        int low = 0;
        int high = m - 1;
        int row = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target < matrix[mid][0]) {
                high = mid - 1;
            } else if (target > matrix[mid][n - 1]) {
                low = mid + 1;
            } else {
                row = mid;
                break;
            }
        }

        if (row == -1) {
            return false;
        }

        low=0;
        high = n-1;

        while(low<=high){
            int guess = low + (high-low)/2;

            if(matrix[row][guess] == target){
                return true;
            }else if(matrix[row][guess] < target){
                low = guess+1;
            }else{
                high = guess-1;

            }
            
            }

            return false;




    }
}