import base.CenarioPadrao;

import java.awt.*;

public class JogoCenario extends CenarioPadrao {
    private static final int ESPACAMENTO = 2;
    private static final int ESPACO_VAZIO = -1;
    private static final int LINHA_COMPLETA = -2;

    private int largBloco, altBloco;
    private int ppx, ppy; // Posicao PECA x e y
    private final int[][] grade = new int[10][16];

    private boolean animar;
    private boolean depurar;

    public JogoCenario(int largura, int altura) {
        super(largura, altura);
    }

    @Override
    public void carregar() {
        largBloco = largura / grade.length;
        altBloco = altura / grade[0].length;

        for(int i = 0; i < grade.length; i++) {
            for(int j = 0; j < grade[0].length; j++) {
                grade[i][j] = ESPACO_VAZIO;
            }
        }

        adicionaPeca();
    }

    public void adicionaPeca() {

    }

    @Override
    public void descarregar() {

    }

    @Override
    public void atualizar() {

    }

    @Override
    public void desenhar(Graphics2D g) {

    }

    public static void main(String[] args) {

    }

}
