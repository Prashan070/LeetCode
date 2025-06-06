class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(count[ch -'a']==1){
                return i;
            }

        }
        return -1;
    }
}