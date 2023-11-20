package task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void findMinimumRemovalsTest1() {
        int actualResult = Task5.findMinimumRemovals(new int[]{5, 6, 7, 8, 1, 2, 3});
        int expectedResult = 3;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void findMinimumRemovalsTest2() {
        int actualResult = Task5.findMinimumRemovals(new int[]{4, 2, 3, 6, 10, 1, 12});
        int expectedResult = 2;
        Assertions.assertEquals(expectedResult, actualResult);
    }
}