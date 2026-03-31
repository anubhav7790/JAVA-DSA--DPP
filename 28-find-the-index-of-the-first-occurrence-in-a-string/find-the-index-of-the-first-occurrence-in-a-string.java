class Solution {
    public int strStr(String haystack, String needle) {
        
        if (needle.length() == 0) return 0; // ✅ edge case

        int i = 0;

        while (i < haystack.length()) {
            int j = 0;
            int first = i;

            if (haystack.charAt(i) == needle.charAt(j)) {
                while (i < haystack.length() && j < needle.length()
                        && haystack.charAt(i) == needle.charAt(j)) {
                    i++;
                    j++;
                }

                if (j == needle.length()) return first;
                else i = first + 1;
            } else {
                i++; // ✅ important for clarity
            }
        }

        return -1;
    }
}