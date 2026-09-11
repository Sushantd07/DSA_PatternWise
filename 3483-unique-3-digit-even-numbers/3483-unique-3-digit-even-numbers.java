class Solution {
    public int totalNumbers(int[] digits) {

        HashSet<Integer> set = new HashSet<>();
        int[] freq = new int[10];

        for(int i=0;i<digits.length;i++){
            freq[digits[i]]++;
        }



        for(int i=1;i<10;i++){
            if(freq[i] == 0) continue;
            freq[i]--;
            for(int j=0;j<10;j++){

                if(freq[j] == 0) continue;
            freq[j]--;
                for(int k=0;k<10;k++){
                    if(freq[k] == 0) continue;
                     
                if(k%2 != 0){
                    continue;
                }

                   int num = i*100 + j*10 + k;

                   set.add(num);
                  
                }
                freq[j]++;
            }
            freq[i]++;
        }

        return set.size();
        
    }
}