import javax.swing.JFrame;

public class Tetris {
    public static void main(String[] args) {
        int width = 10;
        int height = 20;
        int cellSize = 30;

        // Criar a janela
        JFrame frame = new JFrame("Tetris EDU");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width * cellSize, height * cellSize);
        frame.setVisible(true);

        // Croar o painel para exibir o tabuleiro
        TetrisBoardPanel boardPanel = new TetrisBoardPanel(width, height, cellSize);
    
        // Adicionar o painel ao quadro
        frame.add(boardPanel);
    }
}
