using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Práctica2
{
    public partial class Form1 : Form
    {//Bordes de la figura, así como algunos comprobadores.
        int x, y;
        int Xder, Xizq;
        int Yabj, Yarb;
        bool max;
        bool mover;
        bool mini;
        public Form1()
        {
            InitializeComponent();
            Xder = 574;
            Yabj = 520;
            max = false;
            mini = false;
        }//Se inicilaiza con los bordes de la ventana.

        private void areaTrabajo_Paint(object sender, PaintEventArgs e)
        {//Dibujo de las figuras.
            Graphics g = e.Graphics;
            g.FillRectangle(Brushes.Red,10,100,200,300);
            g.DrawRectangle(Pens.White, 10, 100, 200, 300);
            g.FillRectangle(Brushes.White, 220, 100, 200, 300);
            g.DrawRectangle(Pens.Black, 220, 100, 200, 300);
        }

        private void panel2_Paint(object sender, PaintEventArgs e)
        {//Dibujo de la figura arrastrable.
            Graphics s = e.Graphics;
            s.FillRectangle(Brushes.Black, 0, 0, 70, 70);
            s.DrawRectangle(Pens.White, 0, 0, 70, 70);
        }

        private void panel2_MouseCaptureChanged(object sender, EventArgs e)
        {

        }

        private void panel2_Scroll(object sender, ScrollEventArgs e)
        {

        }

        private void areaTrabajo_MouseMove(object sender, MouseEventArgs e)
        {//Movimiento de la figura arrastrable.
            if (mover == true)
            {
                Point mouseMoveLocation = new Point(e.X, e.Y);
                x = e.X;
                y = e.Y;
                //Redibujado de la figura simepre y cuando no haya colisionado con el contenedor.
                colision();
                panel2.Location = new System.Drawing.Point(x, y);
                if (x <= 180 && y <= 422)
                {//Si entra en el area del contenedor, se defininen nuevos máximos y minimos. 
                    max = true;
                }
                if (max)
                {
                    Xder = 158;
                    Yabj = 343;
                }
                if(x >= 10 && y >= 100)
                {
                    mini = true;
                }
                if(mini)
                {
                    Xizq = 10;
                    Yarb = 100;
                }
                colision();
            }
        }
        public void colision()
        {
            //Si a entrado en el contendor, no permite que el objeto salga.
            if (x >= Xder)
            {
                x = Xder;
            }
            if (y >= Yabj)
            {
                y = Yabj;
            }
            if(x <= Xizq)
            {
                x = Xizq;
            }
            if(y <= Yarb)
            {
                y = Yarb;
            }
        }
        //Permite el movimiento del objeto por si le da al label sobre el botón.
        private void label2_Click(object sender, EventArgs e)
        {
            mover = true;
        }
        //Dibujo de un circulo para el segundo botón.
        private void panel3_Paint(object sender, PaintEventArgs e)
        {
            Rectangle r = new Rectangle(10, 5, 65, 65);
            Graphics f = e.Graphics;
            f.FillEllipse(Brushes.Green, r);
        }

        private void panel3_Click(object sender, EventArgs e)
        {//Permite el movimiento del objeto al dar click al botón.
            mover = true;
        }

        private void Form1_KeyPress(object sender, KeyPressEventArgs e)
        {//Permite hacer las mismas funciones con el botón pero con las teclas.
            Console.WriteLine(e.KeyChar.ToString());
            if (e.KeyChar == 'a' || e.KeyChar == 'A')
            {//Al presionar "a" permite que el objeto se mueva.
                mover = true;
            }
            if (e.KeyChar == 'd' || e.KeyChar == 'D')
            {//Al presionar "d" pone al objeto en su posición inicial.
                x = 296;
                y = 254;
                panel2.Location = new System.Drawing.Point(x, y);
                mover = false;
                Xder = 574;
                Yabj = 520;
                max = false;
                mini = false;
            }
        }
        //Objeto en su posición inicial si se da clic sobre el label sobre el botón.
        private void label1_Click(object sender, EventArgs e)
        {
            x = 296;
            y = 254;
            panel2.Location = new System.Drawing.Point(x, y);
            mover = false;
            Xder = 574;
            Yabj = 520;
            max = false;
            mini = false;
        }
        //Objeto en su posición inicial si se da clic sobre el botón.
        private void panel1_Click(object sender, EventArgs e)
        {
            x = 296;
            y = 254;
            panel2.Location = new System.Drawing.Point(x, y);
            mover = false;
            Xder = 574;
            Yabj = 520;
            max = false;
            mini = false;
        }
        //Dibujado del círculo para el primer botón.
        private void panel1_Paint(object sender, PaintEventArgs e)
        {
            Rectangle r = new Rectangle(10, 5, 65, 65);
            Graphics f = e.Graphics;
            f.FillEllipse(Brushes.Green, r);
        }

    }
}
