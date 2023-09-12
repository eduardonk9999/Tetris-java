import java.awt.Color;
public class TetrisPieceFactory {
    public static TetrisPiece createIPiece() {
        TetrisBlock[] blocks = {
            new TetrisBlock(0, 0, Color.CYAN),
            new TetrisBlock(1, 0, Color.CYAN),
            new TetrisBlock(2, 0, Color.CYAN),
            new TetrisBlock(3, 0, Color.CYAN)
        };
        return new TetrisPiece(blocks, Color.CYAN);
    }

    public static TetrisPiece createLPiece() {
        TetrisBlock[] blocks = {
                new TetrisBlock(0, 0, Color.ORANGE),
                new TetrisBlock(0, 1, Color.ORANGE),
                new TetrisBlock(0, 2, Color.ORANGE),
                new TetrisBlock(1, 2, Color.ORANGE)
        };
        return new TetrisPiece(blocks, Color.ORANGE);
    }

    public static TetrisPiece createTPiece() {
        TetrisBlock[] blocks = {
                new TetrisBlock(0, 1, Color.MAGENTA),
                new TetrisBlock(1, 1, Color.MAGENTA),
                new TetrisBlock(2, 1, Color.MAGENTA),
                new TetrisBlock(1, 0, Color.MAGENTA)
        };
        return new TetrisPiece(blocks, Color.MAGENTA);
    }

    public static TetrisPiece createOPiece() {
        TetrisBlock[] blocks = {
                new TetrisBlock(0, 0, Color.YELLOW),
                new TetrisBlock(1, 0, Color.YELLOW),
                new TetrisBlock(0, 1, Color.YELLOW),
                new TetrisBlock(1, 1, Color.YELLOW)
        };
        return new TetrisPiece(blocks, Color.YELLOW);
    }

    public static TetrisPiece createJPiece() {
        TetrisBlock[] blocks = {
                new TetrisBlock(1, 0, Color.BLUE),
                new TetrisBlock(1, 1, Color.BLUE),
                new TetrisBlock(1, 2, Color.BLUE),
                new TetrisBlock(0, 2, Color.BLUE)
        };
        return new TetrisPiece(blocks, Color.BLUE);
    }

    public static TetrisPiece createSPiece() {
        TetrisBlock[] blocks = {
                new TetrisBlock(1, 0, Color.GREEN),
                new TetrisBlock(2, 0, Color.GREEN),
                new TetrisBlock(0, 1, Color.GREEN),
                new TetrisBlock(1, 1, Color.GREEN)
        };
        return new TetrisPiece(blocks, Color.GREEN);
    }

    public static TetrisPiece createZPiece() {
        TetrisBlock[] blocks = {
                new TetrisBlock(0, 0, Color.RED),
                new TetrisBlock(1, 0, Color.RED),
                new TetrisBlock(1, 1, Color.RED),
                new TetrisBlock(2, 1, Color.RED)
        };
        return new TetrisPiece(blocks, Color.RED);
    }
}
