package task5;

public class Task5 {

    public static void main(String[] args) {
        int[] A = {5, 6, 7, 8, 1, 2, 3};
        int minRemovals = findMinimumRemovals(A);
        System.out.println("Наименьшее количество удалений для возрастающей подпоследовательности: " + minRemovals);
    }

    public static int findMinimumRemovals(int[] A) {
        int n = A.length;
        if (n <= 1) {
            return 0;
        }
        int[] lengthArray = new int[n]; // массив с длинами возрастающих последовательностей для каждого элемента исходного массива
        int maxLength = 1;

        for (int i = 0; i < n; i++) {
            lengthArray[i] = 1;
            for (int j = 0; j < i; j++) {
                if (A[i] > A[j]) {
                    lengthArray[i] = Math.max(lengthArray[i], lengthArray[j] + 1);
                }
            }
            maxLength = Math.max(maxLength, lengthArray[i]);
        }

        return n - maxLength;
    }
}
