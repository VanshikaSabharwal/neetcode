// Link:- https://neetcode.io/problems/anagram-groups

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];
        int n = strs.length;

        for(int i = 0; i<n;i++){
            if(!visited[i]){
                List<String> grp = new ArrayList<>();
                grp.add(strs[i]);
                visited[i] = true;

                for(int j = i+1; j<strs.length; j++){
                    if(!visited[j] && isAnagram(strs[i],strs[j])){
                        grp.add(strs[j]);
                        visited[j] = true;
                    }
                }
                result.add(grp);
            }
        }
        return result;
    }
    private boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        int[] count = new int[26];
        for(char c : s1.toCharArray()){
            count[c - 'a']++;
        }
        for(char c : s2.toCharArray()){
            count[c - 'a']--;
        }

        for(int i:count){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}

