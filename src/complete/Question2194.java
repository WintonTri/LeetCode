package complete;

import java.util.ArrayList;
import java.util.List;

// Attempt 1 -> 05/24/2022 (Had to look at a hint, got a little confused with using char in loops)
public class Question2194 {

    public List<String> cellsInRange(String s) {
        List<String> list = new ArrayList<>();
        char frontChar = s.charAt(0), backChar = s.charAt(3);
        char min = s.charAt(1), max = s.charAt(4);

        for (char c = frontChar; c <= backChar; c++) {
            for (char r = min; r <= max; r++) {
                list.add("" + c + r);
            }
        }

        return list;
    }

}
