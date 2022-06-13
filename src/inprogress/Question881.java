package inprogress;

import java.util.Arrays;

public class Question881 {

    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int res = 0;

        int left = 0, right = people.length - 1; // Pointers

        // Note: Constraint, every person will be within limit on their own
        while (left <= right) {
            if (people[left] + people[right] <= limit) { // Can fit 2 people
                left++;
            }
            right--; // Heaviest person will always be counted

            res++; // Increase boat count
        }

        return res;
    }

}
