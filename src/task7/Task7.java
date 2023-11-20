package task7;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        double[] array = {4, 3, 2, 1, 5, 8, 14, 5, 9, 7, 6, 14, 6, 6, 1, 4, 9, 10};
        System.out.println(Arrays.toString(increase_sort(array)));
    }

    public static double[] increase_sort(double[] array) {
        int i = 0;
        while (i < array.length - 1) {
            if (array[i] <= array[i + 1]) {
                i++;
            } else {
                swap(array, i, i + 1);
                i--;
                if (i < 0) i = 0;
            }
        }
        return array;
    }

    private static void swap(double[] array, int j, int i) {
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
