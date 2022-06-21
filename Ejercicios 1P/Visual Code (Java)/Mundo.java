import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Mundo extends Canvas{
    int x, y;
    int w, h;
    int foodx, foody, foods;

    public Mundo(){
        colision();
        x = 20;
        y = 28;
        w = h = 100;

        foodx = (int)(Math.random()*500); //this.getWidth());
        foody = (int)(Math.random()*400);    //this.getHeight());
        System.out.println(foodx + " "+ foody);
        foods = 20;
    }

    public void colision(){
        /**
         * La posicion de "x" de la principal es mayor que la posicion de la secundaria
         * La posicion de "x" de la princpial es mayor que la posicion de la secundaria mas el ancho
         * La posicion de "y" de la principal es mayor que la posicion de la secundaria
         * La posicion de "y" de la principal es mayor que la posicion de la secndaria mas el alto
         */
        if(x > foodx && x < (foodx +  w) &&
            y > foody && y < (foody + h)){
                foodx = (int)(Math.random()*500); //this.getWidth());
                foody = (int)(Math.random()*400);    //this.getHeight());
        }
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
    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.drawRect(x, y, w, h);
        g.fillOval(x, y, w, h);
        g.setColor(Color.WHITE);
        g.drawString("Hola Mundo!!!", x, y + h/2);
        g.setColor(Color.CYAN);
        g.fillOval(foodx, foody, foods, foods);

    }

    
}