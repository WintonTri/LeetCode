package inprogress;

import java.util.ArrayList;
import java.util.List;

// Attempt 1 -> 05/25/2022
public class Question412 {

    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            list.add(getString(i));
        }

        return list;
    }

    public String getString(int i) {
        boolean divisibleThree = i % 3 == 0;
        boolean divisibleFive = i % 5 == 0;
        if (divisibleFive && divisibleThree)
            return "FizzBuzz";
        if (divisibleThree)
            return "Fizz";
        if (divisibleFive)
            return "Buzz";
        return String.valueOf(i);
    }

}
