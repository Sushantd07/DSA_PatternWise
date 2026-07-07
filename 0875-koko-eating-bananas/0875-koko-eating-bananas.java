class Solution {
    long fun(int[] arr, int n,int speed){
        long h=0;

        for(int i=0;i<n;i++){
            h = h+arr[i]/speed;
            if(arr[i]%speed != 0){
                h++;
            }
        }

        return h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max=piles[0];
        for(int i=1;i<piles.length;i++){
          if(max<piles[i]){
            max=piles[i];
          }
        }
        int low=1,high=max;
        int res=-1;
        long hour=0;
         
         while(low<=high){
            int guess = low+(high-low)/2;

            hour = fun(piles,n,guess);
            if(hour>h){
                low = guess +1;
            }else{
                res = guess;
                high = guess-1;
            }
         }

         return res;

    }
}