package complete;

// Attempt 1 Completed -> 04/29/2022
public class Question2011 {

    public int finalValueAfterOperations(String[] operations) {
        int values = 0;

        for (String s : operations)
            values += getVal(s);

        return values;
    }

    public int getVal(String s) {
        switch (s) {
            case "--X":
            case "X--":
                return -1;
            case "++X":
            case "X++":
                return 1;
            default:
                return 0;
        }

    }

}
