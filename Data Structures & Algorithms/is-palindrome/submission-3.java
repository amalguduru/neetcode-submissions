class Solution {
    public boolean isPalindrome(String s) {
        int j = 0, k = s.length() - 1;
        while(j < k) {
            if(!Character.isLetterOrDigit(s.charAt(j))) {
                j++;
            } else if (!Character.isLetterOrDigit(s.charAt(k))) {
                k--;
            } else {
                if( Character.toLowerCase(s.charAt(j)) != Character.toLowerCase(s.charAt(k))) {
                    return false;
                }
                j++;
                k--;
            }
        }
        return true;   
    }
}
