import javax.swing.JFrame;

public class TetrisGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tetris Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 800);

        TetrisBoard board = new TetrisBoard();
        frame.add(board);
        frame.setVisible(true);
        
    }
}
