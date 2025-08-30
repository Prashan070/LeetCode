import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] charS = new int[26];
        int[] charP = new int[26];
        List<Integer> result = new ArrayList<>();

        // frequency of p
        for (char c : p.toCharArray()) {
            charP[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            // add current char
            charS[s.charAt(i) - 'a']++;

            // keep window size = p.length()
            if (i >= p.length()) {
                charS[s.charAt(i - p.length()) - 'a']--;
            }

            // compare after adjusting window
            if (Arrays.equals(charS, charP)) {
                result.add(i - p.length() + 1);
            }
        }

        return result;
    }
}
