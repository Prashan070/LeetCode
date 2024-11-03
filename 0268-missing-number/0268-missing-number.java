class Solution {
    public int missingNumber(int[] nums) {
//         // appeoach one by xor
//         int result = nums.length;
//         for (int i = 0; i < nums.length; i++) {
//              result = result ^ i ^ nums[i];
//         }
//  return result;

      //apprach 2
  int n=nums.length;
  int sum= n*(n+1)/2;
  int total=0;

  for(int i=0;i<nums.length;i++){
    total=total+nums[i];
  }
return sum-total;



  }
}