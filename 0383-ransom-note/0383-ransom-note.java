class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
     HashMap<Character,Integer> map1 = new HashMap<>();   
    
int n = ransomNote.length();
int m = magazine.length();


     for(int i=0;i<n;i++){
        char ch = ransomNote.charAt(i);

        map1.put(ch,map1.getOrDefault(ch,0) + 1);
        
     }
     for(int i=0;i<m;i++){
        char ch = magazine.charAt(i);
       map1.put(ch,map1.getOrDefault(ch,0)-1);
       
     }

     for(int val : map1.values()){
        if(val > 0){
            return false;
        }
     }

    return true;
    }
}