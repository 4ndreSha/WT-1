package task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void findPrimeIndicesTest1() {
        int[] sourceArray = new int[]{1, 2, 3, 4, 5, 7, 19};
        ArrayList actualResult = Task4.findPrimeIndices(sourceArray);
        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6));
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void findPrimeIndicesTest2() {
        int[] sourceArray = new int[]{1, 2, 3, 4, 5, 7, 19, 2, 2, 10, 12};
        ArrayList actualResult = Task4.findPrimeIndices(sourceArray);
        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6, 7, 8));
        Assertions.assertEquals(expectedResult, actualResult);
    }
}