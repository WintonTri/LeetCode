package complete;

import java.util.*;

// Valid -> 04/26/2022
public class Question3 {

    public static void main(String[] args) {
        lengthOfLongestSubstring2("pwwkew");
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

    // Second attempt
    // An alternative to this would be using a hashmap
    // Storing the character and index, then each time the index could be overwritten.
    // Longest length can also be calculated by using the last index the duplicate character was at
    public static int lengthOfLongestSubstring2(String s) {
        if (s.length() == 0)
            return 0;

        int longestLength = 0;
        Queue<Character> queue = new LinkedList<>();

        for (char c : s.toCharArray()) {
            while (queue.contains(c))
                queue.poll();

            queue.add(c);
            longestLength = Math.max(longestLength, queue.size());
            System.out.println("Char Pushed: " + c + ", Longest Size: " + longestLength + ", " + queue);
        }

        return longestLength;
    }

}
