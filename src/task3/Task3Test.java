package task3;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Task3Test {

    @Test
    public void functionTest1(){
        String actualResult = Task3.function(0, 1, 0.2);
        String expectedResult = """
                | 0,0000 | 0,0000 |
                | 0,2000 | 0,2027 |
                | 0,4000 | 0,4228 |
                | 0,6000 | 0,6841 |
                | 0,8000 | 1,0296 |
                | 1,0000 | 1,5574 |
                """;
        Assertions.assertEquals(expectedResult, actualResult);
    }
}