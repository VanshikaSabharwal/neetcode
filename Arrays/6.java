// Link:- https://neetcode.io/problems/string-encode-and-decode

class Solution {

    public String encode(List<String> strs) {
     StringBuilder encoded = new StringBuilder();
     for(String str: strs){
        encoded.append(str.length()).append("#").append(str);
     }
     return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;

            while(str.charAt(j) != '#'){
                j++;
            }

            int len = Integer.parseInt(str.substring(i, j));
            String word = str.substring(j+1, j+1+len);
            decoded.add(word);
            
            i = j + 1 + len;
        }
        return decoded;
    }
}
