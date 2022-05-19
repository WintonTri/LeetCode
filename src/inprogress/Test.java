package inprogress;

import java.util.Scanner;

/*
 *
 */
public class Test {
    public static int  sumDigits(int numX, int numY)
    {
        if (numX == numY)
            return 1;

        int answer = 0;
        for (int i = 0; i < numX; i++) {
            int sum = 0, number = i;
            while (number > 0) {
                // last digit as in the digit all the way on the right
                sum += number % 10; // Adds the last digit
                number = number / 10; // Removes the last digit
            }
            if (sum == numY)
                answer++;
        }
        return answer;
    }

    public static int  countOfBitSets(int numInput)
    {
        return Integer.toBinaryString(numInput)
                .replaceAll("0", "")
                .length();
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        // input for numX
        int numX = in.nextInt();

        // input for numY
        int numY = in.nextInt();


        int result = sumDigits(numX, numY);
        System.out.print(result);

    }
}
