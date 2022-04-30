package complete;

// Attempt 1 Completed -> 04/29/2022
public class Question13 {

    public int romanToInt(String s) {
        int sum = 0;
        char prevChar = '\0';
        for (char c : s.toCharArray()) {
            sum += getVal(c, prevChar);
            prevChar = c;
        }
        return sum;
    }

    // Note: the *2 is because the value would be added previously, but in roman
    // it should be subtract if the left char is smaller, so *2 to remove the previously added value
    private int getVal(char currentChar, char prevChar) {
        int currentCharVal = getCharVal(currentChar);
        if (prevChar == '\0')
            return currentCharVal;

        int prevCharVal = getCharVal(prevChar);
        return prevCharVal >= currentCharVal ? currentCharVal : currentCharVal - prevCharVal * 2;
    }

    private int getCharVal(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

}
