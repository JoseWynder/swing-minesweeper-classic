package br.com.josewynder.campominado;

import javax.swing.JFrame;

import br.com.josewynder.campominado.modelo.Tabuleiro;
import br.com.josewynder.campominado.visao.PainelTabuleiro;

@SuppressWarnings("serial")
public class CampoMinado extends JFrame {

	public CampoMinado() {
		Tabuleiro tabuleiro = new Tabuleiro(6, 12, 9);

		add(new PainelTabuleiro(tabuleiro));
		
		setTitle("Campo Minado");
		setSize(800, 450);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // DISPOSE_ON_CLOSE
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CampoMinado();

		// Precisaria de alguns ajustes para tornar o jogo mais funcional.
		// Como, por exemplo:
		// Fazer com que o primeiro clique seja obrigatoriamente em um campo não minado.
		// Fazer com que o primeiro clique seja obrigatoriamente no campo que abra a maior quantidade possível de outros campos.
		// Fazer com que não existam situações em que seja logicamente impossível acertar o campo.
		// Existem essas situações, ou seja, a lógica do jogo ainda não está bem otimizada.
		//
		// Essas pequenas alterações impossibilitariam que o jogador perca no primeiro clique.
		// Também fariam com que não houvesse situações em que o primeiro clique seja em um campo isolado e cercado de bombas.


	}
}
