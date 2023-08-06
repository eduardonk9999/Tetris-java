import javax.swing.*;


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

}
