class Solution {
    public int countCommas(int n) {
        int temp=n;
        int count=0;

        while(temp>0){
            count++;
            temp = temp/10;
        }

        int h=0;

        for(int i=1000;i<=n;i++){
            h++;
        }

        return h;

        
        
    }
}