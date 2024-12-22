class Solution {
    public String longestPalindrome(String s) {
        String longest = ""; // To store the longest palindrome
        
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isPalindrome(s, i, j)) {
                    String substring = s.substring(i, j + 1);
                    if (substring.length() > longest.length()) {
                        longest = substring;
                    }
                }
            }
        }

        return longest;
    }

    private boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}