class Solution {
    public boolean isPalindrome(String s) {
        int j = 0, k = s.length() - 1;
        while(j < k) {
            while(j < k && !Character.isLetterOrDigit(s.charAt(j))) { j++; }
            while(j < k && !Character.isLetterOrDigit(s.charAt(k))) { k--; }
            char a = Character.toLowerCase(s.charAt(j));
            char b = Character.toLowerCase(s.charAt(k));
            if(a != b) {
                return false;
            }
            j++;
            k--;
        }
        return true;   
    }
}
