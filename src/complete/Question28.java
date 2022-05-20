package complete;


// Attempt 1 Completed -> 05/20/2022
public class Question28 {

    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            if (i + needle.length() > haystack.length()) // Not possible
                return -1;

            for (int j = 0; j < needle.length(); j++) {
                char haystackChar = haystack.charAt(i + j);
                char needleChar = needle.charAt(j);

                if (haystackChar != needleChar)
                    break;

                // Check if last needle char, return i index if true
                if (needle.length() - 1 == j)
                    return i;
            }

        }
        return -1;
    }

}
