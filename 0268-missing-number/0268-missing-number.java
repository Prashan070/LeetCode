class Solution {
    public int missingNumber(int[] nums) {
        int result = nums.length;
       // int result = 0 ; 

        for(int i = 0 ;  i< nums.length; i++){
            result = nums[i]^result^i;
        }
        return result;
    }
}