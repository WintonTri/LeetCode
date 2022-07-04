package inprogress;

import java.util.*;
import java.util.stream.Collectors;

/*
 *
 */
public class Test {


    public int minSetSize(int[] arr) {
        // Key = num, value = occurences
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr)
            map.put(num, map.getOrDefault(num, 0) + 1);
        List<Integer> freqList = new ArrayList<>();
        freqList.addAll(map.values());


        int res = 0;
        int currentSize = arr.length;
        Collections.sort(freqList);
        Collections.reverse(freqList);


        for (int i : freqList) {
            currentSize -= i;
            res++;
            if (currentSize <= arr.length / 2) {
                return res;
            }
        }


        return res;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(345);
        list.add(34);
        list.add(111);
        list.add(31);
        list.add(3);
        list.add(4);
        list.add(5);
        Collections.sort(list);
        System.out.println(list);
        int left = 0, right = list.size() - 1;
        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
        System.out.println(list);
    }

    public static int countWays(List<Integer> nums) {
        int length = nums.size(), count = 0;
        for (int i = 1; i < length; i++) {
            nums.set(i, nums.get(i - 1));
        }

        for (int i = 0, j = 0, k = 0; i < length - 2; i++) {
            while (j <= i || (j < length - 1 && nums.get(j) < nums.get(i) * 2)) {
                j++;
            }

            while (k < j || (k < length - 1 && nums.get(k) - nums.get(i) <= nums.get(length - 1) - nums.get(k))) {
                k++;
            }

            count = (count - j + k) % 1000000007;
        }
        return count;
    }

    public static int vowelsubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }

            if (!isVowel(c) || i == s.length() - 1) {
                System.out.println("Not a vowel: " + c);

                int vowelsCount = map.entrySet()
                        .stream()
                        .filter(entry -> isVowel(entry.getKey()))
                        .mapToInt(Map.Entry::getValue)
                        .sum();

                System.out.println("Vowels Count: " + vowelsCount);

                if (vowelsCount >= 5)
                    count += vowelsCount - 4;

                map.clear(); // Reset the map
            }

        }

        return count;
    }

    public static boolean isVowel(char c) {
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }


    /*
     * Complete the 'minimize' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY point
     *  2. INTEGER k
     */

    public static int minimize(List<Integer> point, int k) {
        point = point.stream()
                .map(i -> {
                    if (i < 0)
                        return i + k;
                    return i - k;
                })
                .collect(Collectors.toList());

        // Setting the min and max values
        int min = point.get(0), max = point.get(0);
        for (int i : point) {
            min = Math.min(i, min);
            max = Math.max(i, max);
        }
        return Math.abs(min - max);
    }

    public static int largestSubgrid(List<List<Integer>> grid, int maxSum) {
        int rowSize = grid.size(), columnSize = grid.get(0).size();
        int[][] sumGrid = new int[rowSize + 1][columnSize + 1]; // Init sum grid

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {


            }
        }

        return 0;
    }


    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            boolean multipleThree = i % 3 == 0;
            boolean multipleFive = i % 5 == 0;
            if (multipleThree && multipleFive) {
                System.out.println("FizzBuzz");
            } else if (multipleThree) {
                System.out.println("Fizz");
            } else if (multipleFive) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }


    }

}
