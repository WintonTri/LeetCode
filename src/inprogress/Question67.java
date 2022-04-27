package inprogress;

public class Question67 {

    // Turn binaries to decimals -> sum decimals -> decimal to binary
    public String addBinary(String a, String b) {
        // TODO -> fix b/c it causes a runtime error
        int aDecimal = Integer.parseInt(a, 2), bDecimal = Integer.parseInt(b, 2);
        int sum = aDecimal + bDecimal;
        return Integer.toBinaryString(sum);
    }

}
