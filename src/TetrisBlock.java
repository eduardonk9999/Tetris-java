
import java.awt.Color;
// representando os blocos individuais das peças
public class TetrisBlock {
    private int x;
    private int y;
    private Color color;

    public TetrisBlock(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

}
