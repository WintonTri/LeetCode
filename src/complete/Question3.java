package complete;

import java.util.ArrayList;
import java.util.Iterator;

// Valid -> 04/26/2022
public class Question3 {

    public static void main(String[] args) {
        lengthOfLongestSubstring("dvdf");
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;

        ArrayList<Character> list = new ArrayList<>();

        int longestLength = 0;
        int currentCount = 0;
        for (char nextChar : s.toCharArray()) {

//            System.out.println("Current List: " + list);
//            System.out.println("Checking: " + nextChar + ", Longest: " + longestLength + ", Current: " + currentCount);
//            System.out.println();

            if (list.contains(nextChar)) {
                longestLength = Math.max(longestLength, currentCount);

                Iterator<Character> iter = list.iterator();
                while (iter.hasNext()) {
                    char next = iter.next();
//                    System.out.println("Removing Char: " + next);
                    iter.remove();
                    if (next == nextChar) {
                        currentCount = list.size();
                        break;
                    }
                }
            }

            currentCount++;
            list.add(nextChar);
        }

//        System.out.println("Longest: " + longestLength + ", Current: " + currentCount);
        list.clear();
        return Math.max(longestLength, currentCount);
    }

}
