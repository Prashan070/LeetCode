class Solution {
    public void rotate(int[] nums, int k) {

 k = k%nums.length;

        int n = nums.length;
        int i = 0;

        swap(i, n - 1, nums);
        swap(i, k - 1, nums);
        swap(k, n - 1, nums);

    }

    void swap(int i, int j, int[] nums) {

        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}