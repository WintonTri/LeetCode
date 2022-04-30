package inprogress;

// Incomplete
public class Question13 {


    //TODO if prev char is less than current char, do val =  current char - prev char
    // ^ not correct, use test case: 4040 -> IVXL

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
