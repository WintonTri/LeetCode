package complete;

import java.util.HashMap;
import java.util.Map;

// Attempt 1 Completed -> 04/29/2022
public class Question1742 {

    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> map = new HashMap<>();
        int currentNum = lowLimit;

        while (currentNum <= highLimit) {
            int boxNum = getBoxNum(currentNum);
            int newAmount = map.containsKey(boxNum) ? map.get(boxNum) + 1 : 1;
            map.put(boxNum, newAmount);
            currentNum++;
        }

        return getLargestInMap(map);
    }

    private int getBoxNum(int num) {
        int boxNum = 0;
        int number = num;
        while (number > 0) {
            boxNum += number % 10;
            number = number / 10;
        }
        return boxNum;
    }

    private int getLargestInMap(Map<Integer, Integer> map) {
        int largest = 0;

        for (int val : map.values()) {
            if (val > largest)
                largest = val;
        }

        return largest;
    }

}
