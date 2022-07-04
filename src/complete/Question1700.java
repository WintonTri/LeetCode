package complete;

import java.util.LinkedList;
import java.util.Queue;

// Attempt 1 Completed -> 07/03/2022
// Note for next attempt, return if number of 0's and 1's in students equals sandwiches.
public class Question1700 {

    public int countStudents(int[] students, int[] sandwiches) {
        if (students.length == 0)
            return 0;

        int sandwichPointer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int student : students)
            queue.add(student);

        while (!queue.isEmpty()) {
            int nextSandwich = sandwiches[sandwichPointer];
            boolean found = false;

            // Need to loop through every remaining student
            for (int i = 0; i < queue.size(); i++) {
                int nextStudent = queue.poll();
                if (nextStudent == nextSandwich) {
                    // Update pointer and queue
                    sandwichPointer++;
                    found = true;
                    break;
                } else {
                    // Move student to the back of the line
                    queue.add(nextStudent);
                }
            }

            // If no preferences reachable, return remaining number of students.
            if (!found)
                return queue.size();
        }

        return 0;
    }

}
