package complete;

// Attempt 1 -> 05/24/2022 (Took a peek at a hint)
public class Question1603 {

    /*

        Big    - 1
        Medium - 2
        Small  - 3

     */

    class ParkingSystem {

        int[] count;

        public ParkingSystem(int big, int medium, int small) {
            count = new int[]{big, medium, small};
        }

        public boolean addCar(int carType) {
            return count[carType - 1]-- > 0;
        }
    }

}
