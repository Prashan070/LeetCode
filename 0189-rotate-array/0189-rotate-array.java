class Solution {
    public void rotate(int[] nums, int k) {

        k=k%nums.length;

        int i = 0;
        int j = nums.length - 1;

        swap(i, j, nums);
        swap(i, k - 1, nums);
        swap(k, j, nums);

    }

    public void swap(int i, int j, int[] nums) {

        while (i < j) {
            int k = nums[i];
            nums[i] = nums[j];
            nums[j] = k;
            i++;
            j--;
        }
    }

}