class Solution {
    public boolean check(int[] nums) {
        int counter = 0;

        for(int i =0 ;  i< nums.length-1 ; i++){
            if(nums[i]>nums[i+1]){
                counter++;
            }
        }
        if(nums[0]<nums[nums.length-1]){
            counter++;
        }
return counter <=1;
    }
}