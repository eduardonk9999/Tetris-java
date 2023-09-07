package ui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;

public class DrawInterface extends JLabel{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                g.drawRect(i * 32 + 32, j * 32, 32, 32);
            }
        }

        g.setColor(Color.BLACK);
        g.drawRect(32, 0, 128, 128);

        repaint();
    }
}
