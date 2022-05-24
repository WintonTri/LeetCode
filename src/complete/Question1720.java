package complete;

// Attempt 1 -> 05/24/2022 (Did not know what XOR was, had to look at a solution)
public class Question1720 {

    public int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length + 1];
        arr[0] = first;

        for (int i = 0; i < encoded.length; ++i)
            arr[i + 1] = arr[i] ^ encoded[i]; // ^ is XOR

        return arr;
    }

}
