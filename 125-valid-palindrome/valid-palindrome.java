class Solution {
    public boolean isPalindrome(String s) {

        String clean = "";
        String reverse = "";

        for(int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if(Character.isLetterOrDigit(c)) {
                clean += Character.toLowerCase(c);
            }
        }

        for(int i = clean.length() - 1; i >= 0; i--) {
            char r = clean.charAt(i);
            reverse += r;
        }

        if(clean.equals(reverse)) {
            return true;
        } else {
            return false;
        }
    }
}