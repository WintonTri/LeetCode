package complete;

// Valid -> 04/26/2022
public class Question14 {

    // First solution
    public String longestCommonPrefix(String[] strs) {
        int arrSize = strs.length;
        if (arrSize == 0)
            return "";

        String longestPrefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String nextString = strs[i];
            int nextStringSize = nextString.length();
            int currentLongestPrefixSize = longestPrefix.length();
            String newPrefix = "";

            for (int j = 0; j < nextStringSize; j++) {
                if (j >= currentLongestPrefixSize)
                    break;

                char nextChar = nextString.charAt(j);
                if (nextString.charAt(j) != longestPrefix.charAt(j))
                    break;
                newPrefix = newPrefix.concat(Character.toString(nextChar));
            }
            longestPrefix = newPrefix;
        }

        return longestPrefix;
    }

//    public String longestCommonPrefix2(String[] strs) {
//        String longestPrefix = strs[0];
//
//        int arrSize = strs.length;
//        for (int i = 1; i < strs.length; i++) {
//            for (char c : longestPrefix.toCharArray()) {
//
//            }
//        }
//
//        return longestPrefix;
//    }

}
