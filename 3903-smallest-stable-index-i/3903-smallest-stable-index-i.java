class Solution {
    public int firstStableIndex(int[] nums, int k) {
int n= nums.length;
int max=Integer.MIN_VALUE;
int min=Integer.MAX_VALUE;
int res = -1;

      
  for(int i=0;i<n;i++){
        if(nums[i]>max){
            max=nums[i];
        }
    for(int j=i;j<n;j++){
        if(nums[j]<min){
            min = nums[j];

        }
    }

        if(max-min <=k){
           return i;
        }
    min = Integer.MAX_VALUE;
  }
  return -1;
        
    }
}