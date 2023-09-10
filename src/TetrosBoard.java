public class TetrosBoard {
    private int[][] board;

    public TetrosBoard(int width, int height) {
        board = new int[width][height];
        // Inicialize o tabuleiro com valores vazios
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                board[i][j] = 0;
            }
        }
    }
    // Métodos e lógica do jogo Tetris vão aqui
}
