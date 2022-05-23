package complete;

// Attempt 1 -> 05/23/2022
public class Question2103 {

    public class Ring {
        boolean red, green, blue;

        void update(char color) {
            if (color == 'R')
                red = true;
            else if (color == 'G')
                green = true;
            else if (color == 'B')
                blue = true;
        }

        boolean isContainsAllColors() {
            return red && green && blue;
        }
    }

    // Example String: B0B6G0R6R0R6G9
    public int countPoints(String rings) {
        final int size = 10;
        Ring[] ringsArr = new Ring[size]; // size 10 because range is from o - 9
        for (int i = 0; i < size; i++)
            ringsArr[i] = new Ring();

        for (int i = 0; i < rings.length(); i += 2) {
            char color = rings.charAt(i);
            int index = Character.getNumericValue(rings.charAt(i + 1));
            ringsArr[index].update(color);
        }

        int count = 0;
        for (Ring ring : ringsArr)
            if (ring.isContainsAllColors())
                count++;
        return count;
    }

}
