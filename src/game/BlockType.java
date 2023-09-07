package game;

import java.util.concurrent.ThreadLocalRandom;

public enum BlockType {
    I,O,T,L,J,Z,S;

    // Sorteia as peças...
    public static BlockType random() {
        return values()[ThreadLocalRandom.current()
        .nextInt(0, values().length)];
    }
}
