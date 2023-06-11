import base.CenarioPadrao;
import java.util.Random;
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

    private int idPeca = -1;
    private int idPrxPeca = -1;
    private Color corPeca;
    private int[][] peca;

    private Random rand = new Random();

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
        ppy = -2; // A peca comeca um pouco acima do topo
        ppx = grade.length / 2 - 1;

        // Primeira Chamada

        if(idPeca == -1) { // Se for a primeira peca
            idPeca = rand.nextInt(Peca.PECAS.length); // Gera um numero aleatorio entre 0 e 6
        } else {
            idPeca = idPrxPeca;
        }
        idPrxPeca = rand.nextInt(Peca.PECAS.length);

        // Isso acontece muito?
        if(idPeca == idPrxPeca){ // Se a peca atual for igual a proxima peca
            idPrxPeca = rand.nextInt(Peca.PECAS.length);
        }
        peca = Peca.PECAS[idPeca];
        corPeca = Peca.Cores[idPeca];
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
