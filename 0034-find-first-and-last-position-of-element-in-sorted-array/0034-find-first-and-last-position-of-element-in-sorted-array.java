class Solution {
    public int[] searchRange(int[] nums, int target) {

        int first = 0;
        int last = nums.length - 1;
        int ans=-1;
        int ans2=-1;

        while (first <= last) {
         int mid = first + (last-first)/2;
            
           if(nums[mid]==target){
            ans=mid;
            last=mid-1;
           }else if(nums[mid]>target){
            last=mid-1;
           }else{
            first=mid+1;
           }

        }

        first = 0;
        last = nums.length - 1;

        while (first <= last) {
         int mid = first + (last-first)/2;
            
           if(nums[mid]==target){
            ans2=mid;
            first=mid+1;
           }else if(nums[mid]>target){
            last=mid-1;
           }else{
            first=mid+1;
           }

        }
return new int[]{ans,ans2};
    }
}