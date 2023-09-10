import java.awt.Graphics;

import javax.swing.JPanel;

public class TetrisBoardPanel extends JPanel {
    private int width;
    private int height;
    private int cellSize;

    public TetrisBoardPanel(int width, int height, int cellSize) {
        this.width = width;
        this.height = height;
        this.cellSize = cellSize;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Desenha a grid :D
        for(int x = 0; x < width; x++) {
            for(int y = 0; y < height; y++) {
                g.drawRect(x * cellSize, y * cellSize, cellSize, cellSize);
            }
        }
    }
    
}
