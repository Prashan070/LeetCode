class Solution {
    public int missingNumber(int[] nums) {
        
        //aproach 1
        // int n = nums.length;

        // int actualSum = (n*(n + 1)) / 2;

        // int total = 0;

        // for (int i = 0; i < n; i++) {
        //     total = total + nums[i];
        // }
        // return actualSum - total;
      
       //approach 2
       int missingNumber = nums.length;

       for(int i = 0; i< nums.length; i++){
        missingNumber = missingNumber^i^nums[i];
       }
      return missingNumber;



    }
}