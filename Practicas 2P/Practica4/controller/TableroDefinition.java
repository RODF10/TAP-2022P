package Practica4.controller;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class TableroDefinition extends JPanel implements MouseListener {
	private static final long serialVersionUID = 1L;
	private BufferedImage cuadricula;
	private Object[][] array;
	public static final int X = 54; 
	public static final int Y = 56; 
	public static final int titulo = 47; 
	public static final int borde = 5; 
	private volatile boolean isTurn;
	private boolean state;

	public TableroDefinition() {
		this(new Object[10][10], "gridLabels.png");
	}

	public TableroDefinition(Object[][] arr) {
		this(arr, "gridLabels.png");
	}

	public TableroDefinition(Object[][] arr, String path) {
		array = arr;
		isTurn = true;
		state = false;
		setBackground(Color.blue);
		setPreferredSize(new Dimension((X+ arr.length + 1 + ((titulo+borde)*array.length)), 
				Y+ arr.length + 1 + ((titulo+borde)*array.length)));
		setSize(getPreferredSize());
		setLocation(0,0);

		try {
			cuadricula = ImageIO.read(new File(path));
		} catch (IOException e) {
			System.out.println("No pudo cargar la imagen");
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	public boolean isTurn() {
		return isTurn;
	}

	public void setTurn(boolean t) {
		isTurn = t;
	}

	public Object[][] getArray() {
		return array;
	}

	public void setArray(Object[][] arr) {
		array = arr;
	}
	
	public boolean getState(){
		return state;
	}
	
	public void setState(boolean s){
		state = s;
	}

}
