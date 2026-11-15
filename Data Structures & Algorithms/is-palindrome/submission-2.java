class Solution {
    public boolean isPalindrome(String s) {
        int j = 0, k = s.length() - 1;
        while(j < k) {
            if(!Character.isLetterOrDigit(s.charAt(j))) {
                j++;
            } else if (!Character.isLetterOrDigit(s.charAt(k))) {
                k--;
            } else {
                char a = Character.toLowerCase(s.charAt(j));
                char b = Character.toLowerCase(s.charAt(k));
                if( a!= b) {
                    return false;
                }
                j++;
                k--;
            }

        }
        return true;   
    }
}
