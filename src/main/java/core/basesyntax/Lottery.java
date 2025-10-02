package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        int number = new Random().nextInt(101);
        BallColor color = ColorSupplier.getRandomColor();
        return new Ball(number, color);
    }
}
