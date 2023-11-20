package task9;

import java.awt.*;
import java.util.ArrayList;

public class Basket {
    int maxWeight;
    int currentWeight;
    private final ArrayList<Ball> balls = new ArrayList<>();

    public Basket(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addBall(Ball ball) {
        if (currentWeight + ball.weight <= maxWeight) {
            balls.add(ball);
            currentWeight += ball.weight;
        }
    }

    public int countBlue() {
        int amount = 0;
        for (Ball ball : balls) {
            if (ball.color.equals(Color.BLUE)) {
                amount++;
            }
        }
        return amount;
    }

    public int countWeight() {
        return currentWeight;
    }
}
