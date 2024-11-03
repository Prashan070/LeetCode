class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // approach 1 T.C=o(m+n) AND S.C- o(m+k)
        // HashSet<Integer> set = new HashSet<>();
        // ArrayList<Integer> ans = new ArrayList<>();

        // for (int i = 0; i < nums1.length; i++) {
        // set.add(nums1[i]);
        // }
        // // set--1,2

        // for (int i = 0; i < nums2.length; i++) {
        // if (set.contains(nums2[i])) {
        // ans.add(nums2[i]);
        // set.remove(nums2[i]);
        // }
        // }

        // int arr[] = new int[ans.size()];
        // for(int i=0;i<ans.size();i++){
        // arr[i]=ans.get(i);
        // }

        // return arr;

        // approach 2
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for(int i=0; i<nums2.length; i++){
            if(set.contains(nums2[i])){
                ans.add(nums2[i]);
            }
        }

        int[] result = new int[ans.size()];
        int i=0;
        for(Integer num : ans){
            result[i++]=num;
        }
        return result;
    }
}
