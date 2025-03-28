class Solution {
    public boolean isPalindrome(int x) {
        int num = Math.abs(x);
        int rev = 0;

        while (num != 0) {
            int last = num % 10;
            rev = rev * 10 + last;
            num = num / 10;

        }
return (x==rev? true : false);
    }
}