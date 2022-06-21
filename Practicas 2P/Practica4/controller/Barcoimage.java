package Practica4.controller;

import java.awt.*;
import javax.swing.ImageIcon;

public class Barcoimage {
	private Image barcovivo;
	boolean jugador1;

	public Barcoimage(boolean jugador1) {
		this.jugador1 = jugador1;

		if (jugador1)
			barcovivo = new ImageIcon("Player1.png").getImage();
	}

	public void setImagen(String file) {
		barcovivo = new ImageIcon(file).getImage();

	}

	public Image getImagen() {
		return barcovivo;
	}
}
