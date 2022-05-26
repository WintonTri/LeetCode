package complete;

// Attempt 1 -> 05/25/2022
public class Question2243 {

    public String digitSum(String s, int k) {
        StringBuilder newS = new StringBuilder(s);

        while (newS.length() > k) {

            String tempS = "";
            char[] arr = newS.toString().toCharArray();
            newS.setLength(0); // Clear string builder
            for (char c : arr) {
                tempS = tempS.concat(Character.toString(c));

                if (tempS.length() >= k) {
                    newS.append(getStringSum(tempS));
                    tempS = "";
                }
            }
            if (tempS.length() > 0)
                newS.append(getStringSum(tempS));
        }

        return newS.toString();
    }

    private String getStringSum(String s) {
        int sum = 0;
        for (char ch : s.toCharArray())
            sum += Character.getNumericValue(ch);
        return String.valueOf(sum);
    }

}
