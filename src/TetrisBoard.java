import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TetrisBoard extends JPanel {
    private static final int larguraCelula = 32;
    private static final int linhas = 30;
    private static final int colunas = 20;
    private Timer timer;

    public TetrisBoard() {
        timer = new Timer(100, new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
            repaint();
           } 
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        desenharGrid(g);
    }

    private void desenharGrid(Graphics g) {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                int x = j * larguraCelula;
                int y = i * larguraCelula;
                g.drawRect(x, y, larguraCelula, larguraCelula);
            }
        }
    }
}
