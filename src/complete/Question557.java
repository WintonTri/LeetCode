package complete;

import java.util.ArrayList;

// Attempt 1 Completed -> 06/11/2022
public class Question557 {

    public String reverseWords(String s) {
        if (s == null)
            return null;
        ArrayList<String> words = new ArrayList<>();

        for (String word : s.split(" ")) {
            words.add(reverseString(word));
        }

        return String.join(" ", words);
    }

    public String reverseString(String s) {
        char[] in = s.toCharArray();
        int begin = 0;
        int end = in.length - 1;
        char temp;
        while (end > begin) {
            temp = in[begin];
            in[begin] = in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }

}
