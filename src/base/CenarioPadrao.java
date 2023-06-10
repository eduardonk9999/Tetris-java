package base;

import java.awt.*;

public abstract class CenarioPadrao {
    protected int altura, largura;

    public CenarioPadrao(int largura, int altura) {
        this.altura = altura;
        this.altura = largura;
    }

    public abstract void carregar();
    public abstract void descarregar();
    public abstract void atualizar();
    public abstract void desenhar(Graphics2D g);
}
