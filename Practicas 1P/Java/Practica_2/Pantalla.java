package Practica_2;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Pantalla extends Frame implements MouseListener, MouseMotionListener, KeyListener{
	private static final long serialVersionUID = 1L;
    private Contenedor obj_pintable;
    int maxX, maxY, minX, minY;//Bordes del contendor.
    
    public Pantalla() {
        maxX=maxY=400;//Se inicia con las medidas totales de la ventana.
        minX=minY=0;
        obj_pintable = new Contenedor();
        obj_pintable.addMouseListener(this);
        obj_pintable.addMouseMotionListener(this);
        obj_pintable.addKeyListener(this);
        this.addKeyListener(this);
        this.add(obj_pintable);
        this.setSize(450,450);
        this.setVisible(true);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pantalla p = new Pantalla();
		p.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
	}
	
	private void collisionChek() {
		if(obj_pintable.getX() <= 130 && obj_pintable.getY() <= 320){
            maxX=130;
            maxY=320;
        }//Hace que el objeto no pueda pasar por el maximo.
        if(obj_pintable.getX() >= maxX)
        {
            obj_pintable.setX(maxX);
        }
        if(obj_pintable.getY() >= maxY)
        {
            obj_pintable.setY(maxY);
        }//Realiza lo mismo pero con los mínimos.
        if(obj_pintable.getX() >= 10 && obj_pintable.getY() >= 100){
            minX=10;
            minY=100;
        }//Hace que el objeto no pueda salir del área.
        if(obj_pintable.getX() <= minX)
        {
            obj_pintable.setX(minX);
        }
        if(obj_pintable.getY() <= minY)
        {
            obj_pintable.setY(minY);
        }
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Tecleada: " + e.getKeyChar());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Presionando " + e.getKeyChar());
        if (!obj_pintable.isClicked()) {
            switch(e.getKeyChar()) {
                case 'd':
                case 'D':
                    obj_pintable.setX(250);
                    obj_pintable.setY(270);
                    maxX=maxY=400;
                    minX=minY=0;
            }//Manda al objeto a su posición original y pone max y min toda la ventana.
            obj_pintable.repaint();
        }
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Liberando " + e.getKeyChar());
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		if(!obj_pintable.isClicked()) {
            obj_pintable.setX(e.getX());
            obj_pintable.setY(e.getY());
            collisionChek();
            obj_pintable.repaint();
        }
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mover");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Clicked");
        if (obj_pintable.isClicked()) {
            obj_pintable.setW(e.getX());
            obj_pintable.setH(e.getY());
            obj_pintable.repaint();
        } else {
            obj_pintable.setX(250);
            obj_pintable.setY(270);
            maxX=maxY=400;
            minX=minY=0;
        }
        obj_pintable.setClicked();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Presionado");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Liberado");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Entrando");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Saliendo");
	}

}
