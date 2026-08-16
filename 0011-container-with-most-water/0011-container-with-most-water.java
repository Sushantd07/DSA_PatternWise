class Solution {
    public int maxArea(int[] height) {
        int res = Integer.MIN_VALUE;

        int n=height.length;
        int i=0,j=n-1;

        while(i<j){

          int area = Math.min(height[i],height[j]) * (j-i);
          
        

          res = Math.max(res,area);
          if(height[i]<height[j]){
            i++;
          }else{
            j--;
          }

        }

        return res;
    }
}