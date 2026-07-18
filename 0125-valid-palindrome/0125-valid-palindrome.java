class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            // Skip non-alphanumeric from left
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            // Skip non-alphanumeric from right
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            char x = Character.toLowerCase(s.charAt(i));
            char y = Character.toLowerCase(s.charAt(j));

            if (x != y) {
                return false;
            }

            i++;
            j--;
        }
        return true;
    }
}
