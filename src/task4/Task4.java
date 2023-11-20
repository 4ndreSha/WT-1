package task4;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        int[] sourceArray = new int[]{1, 2, 3, 4, 5, 7, 19, 2, 2, 10, 12};
        ArrayList<Integer> primeIndices = findPrimeIndices(sourceArray);
        System.out.println(primeIndices);
    }

    public static ArrayList<Integer> findPrimeIndices(int[] array) {
        ArrayList<Integer> primeIndices = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                primeIndices.add(i);
            }
        }

        return primeIndices;
    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}