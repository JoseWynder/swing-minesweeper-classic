package br.com.josewynder.campominado.visao;

import java.awt.GridLayout;

import javax.swing.*;

import br.com.josewynder.campominado.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel {
	
	public PainelTabuleiro(Tabuleiro tabuleiro) {
		setBorder(BorderFactory.createEmptyBorder(0, 5, 5, 5));
		setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));
		
		
		tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));
		
		tabuleiro.registrarObservador(e -> {
			
			SwingUtilities.invokeLater(() -> {
				if(e.isGanhou()) {
					JOptionPane.showMessageDialog(this, "Parabéns! Você venceu o jogo.", "Vitória", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(this, "Você acertou uma mina. Fim de jogo.", "Derrota", JOptionPane.ERROR_MESSAGE);
				}
				
				tabuleiro.reiniciar();
			});
		});
		
	}
}
