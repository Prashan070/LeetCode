class Solution {
    public String mergeAlternately(String word1, String word2) {

    int l1 = word1.length();
    int l2= word2.length();
    int i=0;

StringBuilder newStr = new StringBuilder();
    while(i<l1 || i<l2){
     if(i<l1){
        newStr.append(word1.charAt(i));
     }if(i<l2){
        newStr.append(word2.charAt(i));
     }
     i++;

    }

return newStr.toString();
    }
}