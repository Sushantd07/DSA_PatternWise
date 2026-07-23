class Solution {

    public void fun(int[] arr,int n,int idx,int sum,int target,List<Integer> diary,List<List<Integer>> ans){
        if(idx==n){
            if(sum==target){
                ans.add(new ArrayList<>(diary)); 
            }
            return;
        }

        fun(arr,n,idx+1,sum,target,diary,ans);

        if(arr[idx] + sum <=target){

            diary.add(arr[idx]);
            sum+=arr[idx];
            fun(arr,n,idx,sum,target,diary,ans);
            diary.remove(diary.size()-1);
            sum-=arr[idx];
        }

    
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> diary = new ArrayList<>();

        fun(candidates,candidates.length,0,0,target,diary,ans);

        return ans;
    }
}