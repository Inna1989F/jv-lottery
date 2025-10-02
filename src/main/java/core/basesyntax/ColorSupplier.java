package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final Random RANDOM = new Random();

    public static BallColor getRandomColor() {
        BallColor[] colors = BallColor.values();
        return colors[RANDOM.nextInt(colors.length)];
    }
}
