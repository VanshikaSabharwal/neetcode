// Link:- https://neetcode.io/problems/top-k-elements-in-list

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for(int num:nums){
            freqMap.put(num,freqMap.getOrDefault(num, 0)+1);
        }

        List<Integer> sortedNumbers = new ArrayList<>(freqMap.keySet());
        sortedNumbers.sort((a, b) -> freqMap.get(b) - freqMap.get(a));
        
        int[] result = new int[k];
        for(int i = 0;i<k; i++){
            result[i] = sortedNumbers.get(i);
        }
        return result;
    }
}
