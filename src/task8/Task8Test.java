package task8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task8Test {

    @Test
    void findIndices_test1() {
        double[] a = {1, 2, 3, 4, 5, 6};
        double[] b = {0, 4, 6, 8, 9, 10};
        double[] actualResult = Task8.findIndices(a, b);
        double[] expectedResult = {0, 3, 5, 5, 5, 5};
        Assertions.assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }

    @Test
    void findIndices_test2() {
        double[] a = {1, 2, 3, 4, 5, 6};
        double[] b = {0, 0, 0};
        double[] actualResult = Task8.findIndices(a, b);
        double[] expectedResult = {0, 0, 0};
        Assertions.assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }

    @Test
    void findIndices_test3() {
        double[] a = {1, 2, 3, 4, 5, 6};
        double[] b = {7, 7, 7};
        double[] actualResult = Task8.findIndices(a, b);
        double[] expectedResult = {5, 5, 5};
        Assertions.assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }
}