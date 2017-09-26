/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 *
 *
 * ANSWER: This code prints out the longest block of characters that are in both strings
 */

/**
 * @author Li
 */
public class ReclamationProject {
    /**
     *
     * @param a first string
     * @param b second string
     * @return commonString
     */
    static String longestCommonSubstring(final String a, final String b) {
        String small = a, large = b;
        if (a.length() > b.length()) {
            String temp = a;
            small = b; large = temp;
        }
        String commonString = "";
        for (int i = 0; i < small.length(); i++) {
            for (int j = small.length() - i; j > 0; j--) {
                for (int k = 0; k < large.length() - j; k++) {
                    if (a.regionMatches(i, large, k, j) && j > commonString.length()) {
                        commonString = a.substring(i, i + j);
                    }
                }
            }
        }
        return commonString;
    }
}
