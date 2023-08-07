import javax.swing.*;
import java.awt.*;


public class Board extends JPanel {
    private final int BOARD_WIDTH = 10;
    private final int BOARD_HEIGHT = 22;
    private final int PERIOD_INTERVAL = 300;

    private Timer timer;
    private boolean isFallingFinished = false;
    private boolean isPaused = false;
    private int numLinesRemoved = 0;
    private int curX = 0;
    private int curY = 0;
    private JLabel statusbar;
    private Shape curPiece;
    private Shape.TetrominoType[] board;

    // Construtor
    public Board(Tetris parent) {
        initBoard(parent);
    }

    public void initBoard(Tetris parent) {
        setFocusable(true);
        statusbar = parent.getStatusBar();
        addKeyListener(new TAdpter());
    }

    // Representa a largura de cada quadrado do tabuleiro
    private int squareWidth() {
        return (int) getSize().getWidth() / BOARD_WIDTH;
    }
    // Representa a altura de cada quadrado do tabuleiro
    private int squareHeight() {
        return (int) getSize().getHeight() / BOARD_HEIGHT;
    }

    // Em resumo, o método shapeAt é usado para obter a peça (Tetrominoe) localizada
    // na posição específica (x, y) do tabuleiro do jogo. Ele acessa o array board,
    // que armazena as peças do jogo, e calcula o índice correto no array com base
    // nas coordenadas (x, y) fornecidas. O método retorna a peça encontrada nessa posição.
    private Shape.TetrominoType shepeAt(int x, int y) {
        return board[(y * BOARD_WIDTH) + X];
    }

    void start() {
        curPiece = new Shape();
        board = new Shape.TetrominoType[BOARD_WIDTH * BOARD_HEIGHT];

        clearBoard();
        newPiece();

        timer = new Timer(PERIOD_INTERVAL, new GameCycle());
        timer.start();
    }

    private void pause() {
        isPaused = !isPaused;

        if(isPaused) {
            statusbar.setText("PAUSED");
        } else {
            statusbar.setText(String.valueOf(numLinesRemoved));
        }

        repaint();
    }

    // Resumindo desenha em Tela
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDreawing(g);
    }

}
