package task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {

    @Test
    void printMatrix() {
        String actualResult = Task6.printMatrix(new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        String expectedResult = """
                1,00 2,00 3,00 4,00 5,00 6,00 7,00 8,00 9,00\s
                2,00 3,00 4,00 5,00 6,00 7,00 8,00 9,00 1,00\s
                3,00 4,00 5,00 6,00 7,00 8,00 9,00 1,00 2,00\s
                4,00 5,00 6,00 7,00 8,00 9,00 1,00 2,00 3,00\s
                5,00 6,00 7,00 8,00 9,00 1,00 2,00 3,00 4,00\s
                6,00 7,00 8,00 9,00 1,00 2,00 3,00 4,00 5,00\s
                7,00 8,00 9,00 1,00 2,00 3,00 4,00 5,00 6,00\s
                8,00 9,00 1,00 2,00 3,00 4,00 5,00 6,00 7,00\s
                9,00 1,00 2,00 3,00 4,00 5,00 6,00 7,00 8,00\s
                """;
        Assertions.assertEquals(expectedResult, actualResult);
    }
}