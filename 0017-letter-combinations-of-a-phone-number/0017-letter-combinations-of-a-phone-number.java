class Solution {
     List<String> ans = new ArrayList<>();
    public List<String> letterCombinations(String digits) {

        if(digits.length()==0){
            return ans;
        }
        HashMap<Character, String> map = new HashMap<>();

map.put('2', "abc");
map.put('3', "def");
map.put('4', "ghi");
map.put('5', "jkl");
map.put('6', "mno");
map.put('7', "pqrs");
map.put('8', "tuv");
map.put('9', "wxyz");

solve(digits,0,new StringBuilder(),map);

         return ans;


    }

    void solve(String digits,int idx,StringBuilder curr,HashMap<Character,String> map){

        if(idx == digits.length()){
            ans.add(curr.toString());
            return;
        }
        String letter = map.get(digits.charAt(idx));

        for(int i=0;i<letter.length();i++){

            curr.append(letter.charAt(i));
            solve(digits,idx+1,curr,map);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}