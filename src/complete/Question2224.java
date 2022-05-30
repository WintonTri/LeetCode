package complete;

// Attempt 1 Completed -> 05/29/2022
public class Question2224 {

    public int convertTime(String current, String correct) {
        String[] currentArr = current.split(":");
        String[] correctArr = correct.split(":");

        int currentTime = Integer.parseInt(currentArr[0]) * 60 + Integer.parseInt(currentArr[1]);
        int correctTime = Integer.parseInt(correctArr[0]) * 60 + Integer.parseInt(correctArr[1]);
        int diff = correctTime - currentTime;

        int stepsCounter = 0;

        int[] increaseArr = new int[]{60, 15, 5, 1};
        while (diff > 0) {
            for (int i : increaseArr)
                while (diff >= i) {
                    stepsCounter += diff / i;
                    diff = diff % i;
                }
        }
        return stepsCounter;
    }

}
