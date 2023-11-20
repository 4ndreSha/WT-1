package task9;

import java.awt.*;

public class Task9 {
    public static void main(String[] args) {
        Ball ball1 = new Ball(1, Color.RED);
        Ball ball2 = new Ball(2, Color.BLUE);
        Ball ball3 = new Ball(3, Color.ORANGE);
        Ball ball4 = new Ball(4, Color.BLUE);
        Ball ball5 = new Ball(5, Color.RED);

        Basket basket = new Basket(30);

        basket.addBall(ball1);
        basket.addBall(ball2);
        basket.addBall(ball3);
        basket.addBall(ball4);
        basket.addBall(ball5);

        System.out.println(basket.countBlue());
        System.out.println(basket.countWeight());
    }
}
