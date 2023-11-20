package task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task1Test {

    @Test
    void calculateTest1() {
        Double actualResult = Task1.calculate(1.0, 2.0);
        Double expectedResult = 1.3922749448749296;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void calculateTest2() {
        Double actualResult = Task1.calculate(11.0, 22.0);
        Double expectedResult = 11.153837039770682;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void calculateTest3() {
        Double actualResult = Task1.calculate(0, 0);
        Double expectedResult = 0.5;
        Assertions.assertEquals(expectedResult, actualResult);
    }
}