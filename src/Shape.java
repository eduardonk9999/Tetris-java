public class Shape {
    protected enum TGetrominoe {
        NoShape, ZShape, SShape, LineShape,
        TShape, SquareShape, LShape, MirroredLShape
    }

    private Tetriominoe pieceShape;
    private int[][] coords;
}