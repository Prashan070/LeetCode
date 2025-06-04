class Solution {
    public int lengthOfLastWord(String s) {

        int count = 0;

        

        String t = s.trim();

        if(t.length()<=1){
            return 1;
        }

        for (int j = t.length() - 1; j >= 0; j--) {
            
            if (t.charAt(j) == ' ' ) {
                break;
            }
            count++;

        }
        return count;
    }

}
