// Link:- https://neetcode.io/problems/longest-consecutive-sequence

class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        if(n == 0){
            return 0;
        }

        HashSet<Integer> numSet = new HashSet<>();
        for(int number:nums){
            numSet.add(number);
        }

        int longestStreak = 0;

        for(int num:nums){
            if(!numSet.contains(num-1)){
                int currNum = num;
                int currentStreak = 1;

                while(numSet.contains(currNum+1)){
                    currNum++;
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }
}
