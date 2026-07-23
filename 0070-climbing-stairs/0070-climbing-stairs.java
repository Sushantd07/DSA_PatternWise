class Solution {

    int fun(int n,int idx,HashMap<Integer,Integer> dp){
        if(idx == n){
            return 1;
        }
        if(idx > n) return 0;

        if(dp.containsKey(idx)){
            return dp.get(idx);
        }

        int a = fun(n,idx+1,dp);
        int b = fun(n,idx+2,dp);

        int ans = a+b;

        dp.put(idx,ans);

        return ans;
    }
    public int climbStairs(int n) {

        HashMap<Integer,Integer> dp = new HashMap<>();

        int ans = fun(n,0,dp);
        return ans;
        
    }
}
