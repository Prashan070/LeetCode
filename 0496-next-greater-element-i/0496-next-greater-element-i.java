class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();

     
        for (int i = nums2.length - 1; i >= 0; i--) {
            int currentNum = nums2[i];

            while (!st.isEmpty() && st.peek() <= currentNum) {
                st.pop();
            }

            int nextGen = st.isEmpty() ? -1 : st.peek();

            map.put(currentNum, nextGen);

            st.push(currentNum);
        }

        
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }

        return res;
    }
}
