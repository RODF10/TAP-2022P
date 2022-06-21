package Practica4.BattleshipUI;

import Practica4.controller.Barcoimage;
import Practica4.controllerTableroDefinition;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;


public class BattleshipUI {
	
	public static int tamcuadricula = 10;
	public static int barco1tam = 3;
	public static int barco2tam = 2;
	public static int barco3tam = 1;
        public static int barco4tamaño  = 4;
	public static int posBarco1 = 2;
	public static int posBarco2 = 3;
	public static int posBarco3 = 4;
        public static int posbarco4 = 1;
	private JFrame frame;
	
	private Barco[] BARCOSCreate(boolean isPlayerOne) {
		Barco[] battleships = piezas(barco4tamaño , posbarco4, isPlayerOne);
		Barco[] cruisers = piezas(barco1tam, posBarco1, isPlayerOne);
		Barco[] destroyers = piezas(barco2tam, posBarco2, isPlayerOne);
		Barco[] submarines = piezas(barco3tam, posBarco3, isPlayerOne);

		Barco[] piezas = unirPiezas(battleships, cruisers);
		piezas = unirPiezas(piezas, destroyers);
		piezas = unirPiezas(piezas, submarines);
		return piezas;
	}
        
	private Barco[] unirPiezas(Barco[] a, Barco[] b) {
		int aLen = a.length;
		int bLen = b.length;
		Barco[] c = new Barco[aLen + bLen];
		System.arraycopy(a, 0, c, 0, aLen);
		System.arraycopy(b, 0, c, aLen, bLen);
		return c;
	}
        
	private Barco[] piezas(int shipSize, int numOfShips, boolean isPlayerOne) {
		Barco[] listOfShips = new Barco[numOfShips];
		for (int i = 0; i < numOfShips; i++) {
			Barcoimage[] shipArray = new Barcoimage[shipSize];
			for (int j = 0; j < shipSize; j++) {
				Barcoimage p = new Barcoimage(isPlayerOne);
				shipArray[j] = p;
			}
			listOfShips[i] = new Barco(shipArray);
		}
		return listOfShips;
	}
        	private Object[][] elePosition(Barco[] ships){
		LogicaJuego creator = new LogicaJuego(ships, tamcuadricula, frame);
		creator.iniciar();
		frame.getContentPane().add(creator);
		frame.getContentPane().repaint();
		frame.setVisible(true);
		while (!creator.isSetupOver()) {}
		frame.getContentPane().removeAll();
		frame.getContentPane().revalidate();
		frame.getContentPane().repaint();
		return creator.getGridArray();
	}
                
                public void Ventana() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(900, 615));
		frame.setMinimumSize(new Dimension(900, 615));
		frame.setResizable(false);
		frame.pack();
		Barco[] p1Ships = BARCOSCreate(true);
		TableroDefinition grid = new TableroDefinition(elePosition(p1Ships));
	}
}
