
import java.awt.*;
import java.awt.event.*;


public class VentanaConLayout extends Frame implements ActionListener{
    Button btn, btn1, btn2, btn3;
    Button btns[];
    Panel p1, p2, p3, p4;
    TextArea txt;

    public VentanaConLayout(){
        btn = new Button("Cerrar");
        btns = new Button[10];
        for(int i=0; i<btns.length; i++){
            btns[i] = new Button(i+"");
            btns[i].addActionListener(this);
        }
        btn1 = new Button("");
        btn2 = new Button("");
        btn3 = new Button("");
        p1 = new Panel();
        p2 = new Panel();
        p3 = new Panel();
        p4 = new Panel();
        txt = new TextArea();
        btn.addActionListener(this);

        btn1.setBounds(5, 5, 20, 20);

        this.setLayout(new BorderLayout());
        p1.setLayout(new GridLayout(3, 2));
        for(int i=0; i<6; i++){
            p1.add(btns[i]);
        }
        p2.setLayout(new FlowLayout());
        for(int i=6; i<btns.length; i++){
            p2.add(btns[i]);
        }
        p3.setLayout(new CardLayout());
        p3.add(btns[9]);

        p4.setLayout(null);
        p4.add(btn1);
        p4.add(btn2);
        p4.setSize(200,100);

        this.add(btn, BorderLayout.WEST);
        this.add(p1, BorderLayout.NORTH);
        this.add(p2, BorderLayout.SOUTH);
        this.add(p3, BorderLayout.CENTER);
        this.add(p4,BorderLayout.EAST);

        this.setSize(400,300);
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }

    public static void main(String args[]){
        VentanaConLayout ej = new VentanaConLayout();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn){
            System.exit(0);
        } else {
            System.out.println(e.getActionCommand());
        }
        
    }
}
