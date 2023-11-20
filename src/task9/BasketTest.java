package task9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    @Test
    void countBlue_test() {
        Ball ball1 = new Ball(4, Color.RED);
        Ball ball2 = new Ball(4, Color.BLUE);
        Ball ball3 = new Ball(4, Color.ORANGE);
        Ball ball4 = new Ball(4, Color.BLUE);
        Ball ball5 = new Ball(4, Color.RED);

        Basket basket = new Basket(30);

        basket.addBall(ball1);
        basket.addBall(ball2);
        basket.addBall(ball3);
        basket.addBall(ball4);
        basket.addBall(ball5);

        int actualResult = basket.countBlue();
        int expectedResult = 2;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void countWeight_test() {
        Ball ball1 = new Ball(7, Color.RED);
        Ball ball2 = new Ball(12, Color.BLUE);
        Ball ball3 = new Ball(30, Color.ORANGE);

        Basket basket = new Basket(29);

        basket.addBall(ball1);
        basket.addBall(ball2);
        basket.addBall(ball3);

        int actualResult = basket.countWeight();
        int expectedResult = 19;
        Assertions.assertEquals(expectedResult, actualResult);
    }
}