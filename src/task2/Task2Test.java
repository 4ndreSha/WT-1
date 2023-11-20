package task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void checkTest1() {
        Boolean actualResult = Task2.check(1, 1);
        Boolean expectedResult = true;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void checkTest2() {
        Boolean actualResult = Task2.check(2, 2);
        Boolean expectedResult = true;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void checkTest3() {
        Boolean actualResult = Task2.check(-5, -5);
        Boolean expectedResult = false;
        Assertions.assertEquals(expectedResult, actualResult);
    }
}