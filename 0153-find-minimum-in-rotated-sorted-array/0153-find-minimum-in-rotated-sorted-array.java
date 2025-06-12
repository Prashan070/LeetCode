class Solution {
    public int findMin(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        // If array is not rotated
        if (arr[low] <= arr[high]) {
            return arr[low];
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if mid is the smallest
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                return arr[mid];
            }

            // Check if mid+1 is the smallest
            if (mid < arr.length - 1 && arr[mid] > arr[mid + 1]) {
                return arr[mid + 1];
            }

            // Decide which half to search next
            if (arr[mid] >= arr[low]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // Should not reach here for a valid rotated array
    }
}
