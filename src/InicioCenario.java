import java.awt.Graphics2D;



public class InicioCenario extends base.CenarioPadrao {
    public InicioCenario(int largura, int altura) {
		super(largura, altura);
	}

    private base.Menu menuJogo;

    @Override
    public void carregar() {

       menuJogo = new base.Menu("Nível");
       menuJogo.addOpcoes("1", "2", "3", "4", "5", "6", "7", "8", "9");
       base.Util.centraliza(menuJogo, largura, altura);

       menuJogo.setPy(menuJogo.getPy() + menuJogo.getAltura());

	   menuJogo.setAtivo(true);
	   menuJogo.setSelecionado(true);
    }

    @Override
    public void descarregar() {
        Jogo.nivel = menuJogo.getOpcaoId() + 1;
    }

    @Override
    public void atualizar() {
        if (Jogo.controleTecla[Jogo.Tecla.ESQUERDA.ordinal()] || Jogo.controleTecla[Jogo.Tecla.DIREITA.ordinal()]) {
			menuJogo.setTrocaOpcao(Jogo.controleTecla[Jogo.Tecla.ESQUERDA.ordinal()]);
		}

		Jogo.liberaTeclas();
    }

    @Override
    public void desenhar(Graphics2D g) {
        menuJogo.desenha(g);
    }

    
}
