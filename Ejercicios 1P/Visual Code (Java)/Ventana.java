//package Ejercicios;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//import java.util.ArrayList;

public class Ventana extends Frame implements ActionListener{
	Button aceptar, ig;
    TextField text;
    TextArea txt;
    Panel central;
	//ArrayList<Integer> numeros;
	int res = 0;
   
    
	public Ventana(){
		aceptar = new Button("aceptar");
		ig = new Button("=");
		aceptar.addActionListener(this);
		ig.addActionListener(this);
	    text = new TextField();
	    txt = new TextArea();
	    central = new Panel();
		//numeros = new ArrayList<>();
	    
	    central.setLayout(new BorderLayout());
	    central.add(aceptar,BorderLayout.WEST);
	    central.add(text,BorderLayout.CENTER);
	    central.add(ig,BorderLayout.EAST);
	    //central.add(txt,BorderLayout.SOUTH);
	    
	    this.setLayout(new BorderLayout());
	    this.add(central,BorderLayout.NORTH);
	    this.add(txt,BorderLayout.CENTER);
	    this.setSize(800,600);
	    this.setVisible(true);
	}
	
	public static void main(String[] args) {
		Ventana v = new Ventana();
		v.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == aceptar){
				String c = text.getText();
				try{
					int num = Integer.parseInt(c);
					res = res+num;
					txt.append(c+"\n");
				} catch(NumberFormatException en){
					
				}
				text.setText("");
			} else {
				String resultado = Integer.toString(res);
				txt.setText(resultado);
			}
			
	}

}
