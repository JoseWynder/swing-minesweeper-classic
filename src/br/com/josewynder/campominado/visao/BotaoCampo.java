package br.com.josewynder.campominado.visao;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import br.com.josewynder.campominado.modelo.Campo;
import br.com.josewynder.campominado.modelo.CampoEvento;
import br.com.josewynder.campominado.modelo.CampoObservador;

@SuppressWarnings("serial")
public class BotaoCampo extends JButton 
	implements CampoObservador, MouseListener {

	private final Color BG_PADRAO =new Color(184, 184, 184);
	private final Color BG_ABRIR =new Color(175, 175, 175);
	private final Color BG_MARCAR =new Color(184, 184, 184);
	private final Color BG_EXPLODIR =new Color(217, 29, 32);
	private final Color TEXTO_VERDE =new Color(0, 100, 0);

	private static final Icon MARCADO_ICON = carregarIconeMarcado();
	private static final Icon BOMBA_ICON = carregarIconeBomba();

	private Campo campo;
	
	public BotaoCampo(Campo campo) {
		this.campo = campo;
		setBackground(BG_PADRAO);
		setOpaque(true);
		setBorder(BorderFactory.createBevelBorder(0));
		
		addMouseListener(this);
		campo.registrarObservador(this);
	}

	private static Icon carregarIconeMarcado() {
		ImageIcon icon = new ImageIcon(BotaoCampo.class.getResource("/br/com/josewynder/campominado/resources/images/minesweeper_flag.png"));
		Image img = icon.getImage()
				.getScaledInstance(55, 55, Image.SCALE_DEFAULT);
		return new ImageIcon(img);
	}

	private static Icon carregarIconeBomba() {
		ImageIcon icon = new ImageIcon(BotaoCampo.class.getResource("/br/com/josewynder/campominado/resources/images/bomb.png"));
		Image img = icon.getImage()
				.getScaledInstance(40, 40, Image.SCALE_DEFAULT);
		return new ImageIcon(img);
	}

	@Override
	public void eventoOcorreu(Campo campo, CampoEvento evento) {
		switch(evento) {
		case ABRIR:
			aplicarEstiloAbrir();
			break;
		case MARCAR:
			aplicarEstiloMarcar();
			break;
		case EXPLODIR:
			aplicarEstiloExplodir();
			break;
		default:
			aplicarEstiloPadrao();
			break;
		}
		
//		SwingUtilities.invokeLater(() -> {
//			repaint();
//			validate();
//		});
	}

	private void aplicarEstiloPadrao() {
		setBorder(BorderFactory.createBevelBorder(0));
		setBackground(BG_PADRAO);
		setText("");
		setIcon(null);
	}

	private void aplicarEstiloExplodir() {
		setBackground(BG_EXPLODIR);
		setForeground(Color.WHITE);
		setText("");
		setIcon(BOMBA_ICON);
	}

	private void aplicarEstiloMarcar() {
		setBackground(BG_MARCAR);
		setForeground(Color.BLACK);
		setText("");
		setIcon(MARCADO_ICON);
	}

	private void aplicarEstiloAbrir() {
		
		setBorder(BorderFactory.createLineBorder(Color.GRAY));
		
		if(campo.isMinado()) {
			setBackground(BG_EXPLODIR);
			setText("");
			setIcon(BOMBA_ICON);
			return;
		}
		
		setBackground(BG_ABRIR);
		setIcon(null);
		
		switch (campo.minasNaVizinhanca()) {
		case 1:
			setForeground(TEXTO_VERDE);
			break;
		case 2:
			setForeground(Color.BLUE);
			break;
		case 3:
			setForeground(Color.YELLOW);
			break;
		case 4, 5, 6:
			setForeground(Color.RED);
			break;
		default:
			setForeground(Color.PINK);
			break;
		}
		
		String valor = !campo.vizinhancaSegura() ?
				campo.minasNaVizinhanca() + "" : "";
		setText(valor);
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getButton() == 1) {
			campo.abrir();
		} else {
			campo.alternarMarcacao();
		}
	}
	
	// Existe a possibilidade de você criar uma interface sua
	//  e definir todos esses métodos como vazio por padrão.
	public void mouseClicked(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	
}
