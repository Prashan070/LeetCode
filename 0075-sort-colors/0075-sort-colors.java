class Solution {
    public void sortColors(int[] arr) {

        int l = 0;
        int m = 0;
        int h = arr.length - 1;

        while (m <= h) {

            if (arr[m] == 0) {
                swap(l, m, arr);
                l++;
                m++;
            } else if (arr[m] == 1) {
                m++;
            } else if (arr[m] == 2) {
                swap(m, h, arr);
                h--;
            }
        }

    }

    public void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}