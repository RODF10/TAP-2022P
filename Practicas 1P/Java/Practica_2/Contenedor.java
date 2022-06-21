package Practica_2;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Contenedor extends Canvas{
	private static final long serialVersionUID = 1L;
    private int x, y;	//Servirán para poder arrastrar el objeto.
    private int w, h;
    private boolean Clicked;
    
    public Contenedor() {
        x = 250;	//Datos donde se dibuja el objeto arrastrable.
        y = 270;
        w = 300;
        h = 220;
        Clicked = false;
    }
    
    public void paint(Graphics g) {
        //Cuadrado
        g.setColor(Color.RED);
        g.fillRect(10, 100, 200, 300);
        g.setColor(Color.gray);
        g.drawRect(10,100,200,300);
        //Rombo
        g.setColor(Color.white);
        g.drawRect(220, 100, 200, 300);
        g.setColor(Color.BLACK);
        g.drawRect(220, 100, 200, 300);
        //Círculo 1
        g.setColor(Color.GRAY);
        g.drawArc(200, 0, 80, 80,0,360);
        g.setColor(Color.green);
        g.fillArc(200, 0, 80, 80,0,360);
        //Objeto arrastrable
        g.setColor(Color.GRAY);
        g.drawArc(x, y, 80, 80,0,360);
        g.setColor(Color.black);
        g.fillArc(x, y, 80, 80,0,360);
        //Texto
        g.drawString("Figura arrastrable\n"+"\na estado original(D)",170,20);
    }

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}
    
	public void setClicked() {
        this.Clicked = !this.Clicked;
    }
	
	//Determina la el click sobre la figura.
    public boolean isClicked() {
        return Clicked;
    }

}
