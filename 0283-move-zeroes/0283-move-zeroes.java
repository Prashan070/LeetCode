class Solution {
    public void moveZeroes(int[] nums) {
        
        //ONE WAY
        // int j = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] != 0) {
        //         nums[j] = nums[i];
        //         j++;
        //     }

        // }
        // for (int i = j; i < nums.length; i++) {
        //     nums[i] = 0;
        // }

        //SECOND WAY
        int j=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] !=0){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }

    }
}