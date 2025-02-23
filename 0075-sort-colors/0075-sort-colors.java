class Solution {
    public void sortColors(int[] arr) {
        int m = 0;
        int l = 0;
        int h = arr.length - 1;

        while (m <= h) {

            if (arr[m] == 0) {
               swap(m,l,arr);
                l++;
                m++;
            }
            else if(arr[m]==1){
             m++;   
            }else if(arr[m]==2){
            swap(m,h,arr);
                  h--;
            }
        }

    }

    void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

/// 0---(l-1)---0
/// l----(m-1)---1
/// m---k
/// k+1---n-1----2