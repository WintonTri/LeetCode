package complete;

// Attempt 2 Completed -> 05/29/2022
public class Question67 {

    // Turn binaries to decimals -> sum decimals -> decimal to binary
    public String addBinary(String a, String b) {
        int aDecimal = Integer.parseInt(a, 2), bDecimal = Integer.parseInt(b, 2);
        int sum = aDecimal + bDecimal;
        return Integer.toBinaryString(sum);
    }

    //    Input: a = "11", b = "1"
    //    Output: "100"
    // Looked at a hint
    public String addBinary2(String a, String b) {
        StringBuilder sb = new StringBuilder();
        // Starting checking from the very right of the string
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0)
                sum += b.charAt(j--) - '0';
            if (i >= 0)
                sum += a.charAt(i--) - '0';
            sb.append(sum % 2);
            carry = sum / 2; // Carry occurs when values 1 + 1 -> 10
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }

}
