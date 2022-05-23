package complete;

import java.util.Arrays;

// Attempt 1 -> 05/23/2022
public class Question1941 {

    public boolean areOccurrencesEqual(String s) {
        int[] counterArr = new int[26]; // There are 26 characters in the alphabet

        // Increment counterArr by 1 for each character
        for (char c : s.toCharArray())
            counterArr[c - 'a']++;

        int count = counterArr[s.charAt(0) - 'a'];

        for (int i : counterArr)
            if (i != 0 && i != count)
                return false;

        return true;
//        return Arrays.stream(counterArr)
//                .allMatch(i -> i == 0 || i == count);
    }

}
