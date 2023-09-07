package game;

import java.awt.Color;

public class Block {
    BlockType type;
    int x, y, size, rotation = 0;
    int[][][] bounds;
    Color color;
    boolean movable = true;

    public Block() {
        type = BlockType.random();
        switch (type) {
            case I:
                size = 4;
                break;
            case O:
                size = 2;
                break;
                
        }
        switch(type) {
            case 
                I: color = Color.CYAN;
                break;
            case 
                O: color = Color.YELLOW;
                break;
            case 
                T: color = Color.MAGENTA;
                break;
            case 
                L: color = Color.ORANGE;
                break;
            case 
                J: color = Color.BLUE;
                break;
            case 
                Z: color = Color.RED;
                break;
            case 
                S: color = Color.GREEN;
                break;
        }

        // POSICAO INICIAL DA PEÇA
        // -2 de altura pois começa acima do tabuleiro
        x = 4;
        y = -2;
    }
}
