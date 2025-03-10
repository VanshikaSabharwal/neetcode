// Link:- https://neetcode.io/problems/is-anagram
class Solution {
    public boolean isAnagram(String s, String t) {
      if(s.length() != t.length()){
        return false;
      }
      int[] charCnt = new int[26];

      for(int i = 0; i<s.length(); i++){
        charCnt[s.charAt(i) - 'a']++;
        charCnt[t.charAt(i) - 'a']--;
      }

      for(int cnt: charCnt){
        if(cnt != 0){
            return false;
        }
      }
      return true;
    }
}
