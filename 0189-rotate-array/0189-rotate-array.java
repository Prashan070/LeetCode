class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;//important point 
        int n = nums.length-1;
        reverse(0, n, nums);
        reverse(0, k - 1, nums);
        reverse(k, n, nums);

    }

    public void reverse(int i, int j, int[] nums) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
