package complete;

// Attempt 1 Completed -> 06/17/2022
public class Question739 {

    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            int numDays = 0;
            boolean hasFutureHotterDay = false;
            for (int j = i + 1; j < temperatures.length; j++) {
                numDays++;
                if (temperatures[j] > temperatures[i]) {
                    hasFutureHotterDay = true;
                    break;
                }
            }
            res[i] = hasFutureHotterDay ? numDays : 0;
        }

        return res;
    }

}
