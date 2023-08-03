public class Shape {
    protected enum Tetrominoe {
        NoShape, ZShape, SShape, LineShape,
        TShape, SqyareShape, LShape, MirrorredLShape
    }

    private Tetrominoe pieceShape;
    private int[][] coords;

    public Shape() {
        coords = new int[4][2];
        setShape(Tetrominoe.NoShape);
    }

    void setShape(Tetrominoe shape) {
        int[][][] coordsTable = new int[][][]{
            {{0, 0}, {0, 0}, {0, 0}, {0, 0}},
            {{0, -1}, {0, 0}, {-1, 0}, {-1, 1}},
            {{0, -1}, {0, 0}, {1, 0}, {1, 1}},
            {{0, -1}, {0, 0}, {0, 1}, {0, 2}},
            {{-1, 0}, {0, 0}, {1, 0}, {0, 1}},
            {{0, 0}, {1, 0}, {0, 1}, {1, 1}},
            {{-1, -1}, {0, -1}, {0, 0}, {0, 1}},
            {{1, -1}, {0, -1}, {0, 0}, {0, 1}}
        };
        for (int i = 0; i < 4; i++) {
            System.arraycopy(coordsTable[shape.ordinal()], 0, coords, 0, 4);
        }
        pieceShape = shape;
    }
    // setX e setY: São usadas para definir as coordenadas absolutas das
    // células individuais da peça. Isso permite que a posição da peça seja
    // atualizada conforme ela se move na grade do jogo.
    private void setX(int index, int x) {
        coords[idnex][0] = x;
    }
    private void setY(int index, int  y) {
        coords[index][1] = y;
    }

    // x e y: São usadas para obter as coordenadas absolutas das células individuais da peça.
    // Essas funções permitem que você saiba a posição atual da peça em relação à grade do jogo.

    int x(int index) {
        return coords[index][0];
    }

    int y(int index){
        return coords[index][1];
    }

    // getShape: Retorna o tipo da peça Tetrominoe atualmente configurada, permitindo
    // que você saiba qual é o formato específico da peça.
    Tetrominoe getShape() {
        return pieceShape;
    }


    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.setShape(Tetrominoe.NoShape);
    }
}



