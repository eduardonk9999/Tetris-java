import java.util.Random;

public class Shape {
    protected enum Tetrominoe {
        NoShape, ZShape, SShape, LineShape,
        TShape, SquareShape, LShape, MirrorredLShape
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
        coords[index][0] = x;
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

    //  é usada para escolher uma peça Tetrominoe aleatoriamente e configurá-la
    //  como a forma atual da peça a ser utilizada no jogo. Cada vez que esse método é chamado,
    //  uma peça Tetrominoe diferente pode ser selecionada aleatoriamente para adicionar variedade
    //  e imprevisibilidade ao jogo Tetris.
    void setRandomShape() {
        var r = new Random();
        int x = Math.abs(r.nextInt()) % 7 + 1;

        Tetrominoe[] values = Tetrominoe.values();
        setShape(values[x]);
    }

    //Essa informação pode ser útil para diversas finalidades,
    // como verificar se a peça está prestes a colidir com uma parede à esquerda
    public int minX() {
        int m = coords[0][0];
        for(int i = 0; i < 4; i++){
            m = Math.min(m, coords[i][0]);
        }
        return m;
    }

    // verificar se a peça está prestes a colidir com o fundo ou com outras peças no jogo
    public int minY() {
        int m = coords[0][1];
        for(int i = 0; i < 4; i++){
            m = Math.min(m, coords[i][1]);
        }
        return m;
    }

    Shape rotateLeft() {
        if(pieceShape == Tetrominoe.SquareShape) {
            return this;
        }

        var result = new Shape();
        result.pieceShape = pieceShape;

        for(int i = 0; i < 4; i++) {
            result.setX(i, y(i));
            result.setY(i, -x(i));
        }

        return result;
    }




    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.setShape(Tetrominoe.NoShape);
    }
}



