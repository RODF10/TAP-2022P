
package Practicas.Java.Practica3.WEB;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import Practicas.Java.Practica3.Directorio.Directorios;
import Practicas.Java.Practica3.IP.DireccionIP;
import Practicas.Java.Practica3.Tiempo.TiempoDeCarga;


public class VistaDEweb extends Frame implements ActionListener{

    String host1 = "itescam.edu.mx";
    String host = "https://itescam.edu.mx";
    
    public VistaDEweb() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        panel_superior = new Panel();
        panel_central = new Panel();
        panel_superior.setLayout(new GridLayout());
        panel_central.setLayout(new GridLayout());
        btn_1 = new Button ("Directorios");
        btn_1.addActionListener(this);
        btn_2 = new Button ("IP");
        btn_2.addActionListener(this);
        btn_3 = new Button ("Núm. Directorios");
        btn_3.addActionListener(this);
        btn_4 = new Button ("Tiempo de Carga");
        btn_4.addActionListener(this);
        btn_5 = new Button ("Limpiar");
        btn_5.addActionListener(this);
        txt_in = new TextArea();
        panel_superior.setLayout(new GridLayout(1,5));
        panel_superior.add(btn_1);
        panel_superior.add(btn_2);
        panel_superior.add(btn_3);
        panel_superior.add(btn_4);
        panel_superior.add(btn_5);
        panel_central.setLayout(new GridLayout(1,1));
        panel_central.add(txt_in);
        this.setLayout(new BorderLayout());
        this.add(panel_superior, BorderLayout.NORTH);//Se añaden los paneles con un border layout
        this.add(panel_central, BorderLayout.CENTER);
        this.setSize(500,400);//Se especifican las propiedades de la ventana, como tamaño y que se muestre.
        this.setResizable(true);
        this.setVisible(true);
        this.setTitle("Práctica 3"); 

       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn_1){
            Directorios dir = new Directorios();
            txt_in.setText(Arrays.toString(dir.conjuntoDirectorios(host)));
        
        }
        if (e.getSource() == btn_2){
            DireccionIP ip = new DireccionIP();
            txt_in.setText(ip.direccion(host1)); 
        }
        if (e.getSource() == btn_3){
            Directorios dir = new Directorios();
            txt_in.setText(Arrays.toString(dir.conjuntoDirectorios(host)));
            txt_in.setText(Integer.toString(dir.getTamaño()));
        }
        if (e.getSource() == btn_4){
            TiempoDeCarga t = new TiempoDeCarga();
            txt_in.setText(Integer.toString((t.carga(host))));
        }
        if (e.getSource() == btn_5){
            txt_in.setText("");
        }
    }

    protected Button btn_1;
    protected Button btn_2;
    protected Button btn_3;
    protected Button btn_4;
    protected Button btn_5;
    protected Panel panel_central;
    protected Panel panel_superior;
    protected TextArea txt_in;

}
