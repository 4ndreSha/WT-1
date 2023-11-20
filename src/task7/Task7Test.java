package task7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


class Task7Test {

    @Test
    void sort_test1() {
        double[] array = {4, 3, 2, 1, 5, 8, 14, 5, 9, 7, 6, 14, 6, 6, 1, 4, 9, 10};
        String actualResult = Arrays.toString(Task7.increase_sort(array));
        double[] expectedResult = {1, 1, 2, 3, 4, 4, 5, 5, 6, 6, 6, 7, 8, 9, 9, 10, 14, 14};
        Assertions.assertEquals(Arrays.toString(expectedResult), actualResult);
    }

    @Test
    void sort_test2() {
        double[] array = {2, 2, 2, 2};
        String actualResult = Arrays.toString(Task7.increase_sort(array));
        double[] expectedResult = {2, 2, 2, 2};
        Assertions.assertEquals(Arrays.toString(expectedResult), actualResult);
    }

    @Test
    void sort_test3() {
        double[] array = {1, 2, 3, 4};
        String actualResult = Arrays.toString(Task7.increase_sort(array));
        double[] expectedResult = {1, 2, 3, 4};
        Assertions.assertEquals(Arrays.toString(expectedResult), actualResult);
    }

    @Test
    void sort_test4() {
        double[] array = {5, 4, 3, 2, 2, 1};
        String actualResult = Arrays.toString(Task7.increase_sort(array));
        double[] expectedResult = {1, 2, 2, 3, 4, 5};
        Assertions.assertEquals(Arrays.toString(expectedResult), actualResult);
    }
}