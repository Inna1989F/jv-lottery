package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public BallColor getRandomColor() {
        BallColor[] colors = BallColor.values();
        return colors[random.nextInt(colors.length)];
    }
}


