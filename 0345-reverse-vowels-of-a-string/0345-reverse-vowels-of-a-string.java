class Solution {
    public String reverseVowels(String s) {
        char c[] = s.toCharArray();
        int i = 0;
        int j = c.length - 1;

        while (i < j) {
            while (i < j && !isVolvel(c[i])) {
                i++;
            }
            while (i < j && !isVolvel(c[j])) {
                j--;
            }
            char swap = c[i];
            c[i] = c[j];
            c[j] = swap;
            i++;
            j--;
        }
        return String.valueOf(c);
    }

    public boolean isVolvel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U') {
            return true;
        } else {
            return false;
        }
    }
}