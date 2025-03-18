// Link:- https://neetcode.io/problems/two-integer-sum-ii

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int n = numbers.length;
        int right = n-1;

        while(left<right){
            int sum = numbers[left] + numbers[right];

            if(sum == target){
                return new int[]{left+1,right+1};
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }
}
