package inprogress;

// Incomplete
public class Question13 {

    public int romanToInt(String s) {
        int sum = 0, stringSize = s.length();
        for (int i = 0; i < stringSize; i++) {
            char c = s.charAt(i);
            switch (c) {

                case 'I':
                    sum += 1;
                    break;

            }
        }
        return sum;
    }

}
