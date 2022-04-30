package complete;

import java.util.ArrayList;
import java.util.List;

// Attempt 1 Completed -> 04/29/2022
// Should redo this problem in the future.
// Nick White Solution: https://www.youtube.com/watch?v=imD5XeNaJXA
public class Question17 {

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    // Observation -> Can use a 2d array
    /*
        AD AE AF
        BD BE BF
        CD CE CF
     */

    // Note: What about when digit 9 is used? w x y z
    // Example: "89", 8 = "tuv", 9 = "wxyz"
    /*
        tw tx ty tz
        uw ux uy uz
        vw vx vy vz
     */


    public static List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0)
            return new ArrayList<>();

        // Loading the letters
        ArrayList<String> list = new ArrayList<>();
        for (char c : digits.toCharArray()) {
            String letters = getLetters(c);
            list.add(letters);
        }

        // Loading combinations
        ArrayList<String> combinationsList = new ArrayList<>();
        for (String s : list) {

            // Case: Empty list
            if (combinationsList.isEmpty()) {
                for (char c : s.toCharArray())
                    combinationsList.add(Character.toString(c));
                continue;
            }

            ArrayList<String> temp = new ArrayList<>();
            for (String combo : combinationsList) {
                for (char c : s.toCharArray())
                    temp.add(combo + c);
            }
            combinationsList = temp;
        }


        return combinationsList;
    }

    public static String getLetters(char num) {
        switch (num) {
            case '2':
                return "abc";
            case '3':
                return "def";
            case '4':
                return "ghi";
            case '5':
                return "jkl";
            case '6':
                return "mno";
            case '7':
                return "pqrs";
            case '8':
                return "tuv";
            case '9':
                return "wxyz";
            default:
                return "";
        }
    }

}
