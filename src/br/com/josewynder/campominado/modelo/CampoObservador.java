package br.com.josewynder.campominado.modelo;

public interface CampoObservador { // Interface para informar que o evento aconteceu.
	 	// Não era tão necessária nesse caso.

	public void eventoOcorreu(Campo campo, CampoEvento evento);
}
