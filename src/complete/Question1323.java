package complete;

// Attempt 1 -> 05/25/2022
public class Question1323 {

    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        return Integer.parseInt(s.replaceFirst("6", "9"));
    }

}
