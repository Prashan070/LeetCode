class Solution {
    public int missingNumber(int[] nums) {
        // appeoach one by xor
        int result = nums.length;
        for (int i = 0; i < nums.length; i++) {
             result = result ^ i ^ nums[i];
        }
 return result;
    }
}