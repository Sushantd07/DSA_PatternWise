class Solution {

    int fun(int[] arr,int k,int d){

        int count=0,adj=0;
        int n=arr.length;

       for(int i=0;i<n;i++){
          if(arr[i]<=d){
            adj++;
            if(adj==k){
                count++;
                adj=0;
            }
          }else{
            adj=0;
          }
       }
       return count;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;

        if((long)m*k>n){
            return -1;
        }
        int max=bloomDay[0];
        int min=bloomDay[0];
        for(int i=1;i<n;i++){
            if(min>bloomDay[i]){
                min=bloomDay[i];
            }
        }
        for(int i=1;i<n;i++){
           if(max < bloomDay[i]){
            max = bloomDay[i];
           }
        }

        int low=min,high=max;
        int res=-1;

        while(low<=high){
            int guess = low + (high-low)/2;

            int bouquet = fun(bloomDay,k,guess);

            if(bouquet<m){
              low = guess+1;
            }else{
                res=guess;
                high=guess-1;
            }

        }

        return res;

        
    }
}