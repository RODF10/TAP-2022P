using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;



namespace Canvas
{
    public partial class Form1 : Form
    {
          Image uno = null;
          int x, y;
          int fx, fy;
          int img = 0;
          double vel = 0.01;
          int tiempo = 200;
          int fila = 0;
        User user;

        public Form1()
        {
            InitializeComponent();
            uno = Image.FromFile("Recursos\\TT1.jpg");
            x = y = 0;
            fx = fy = 0;
            tick.Enabled = true;
            user = new User();
            tick.Start(); 
        }
        private void tick_Tick(object sender, EventArgs e)
        {
            img++;
            if (img > 3) img = 0;
            CollisionCheck();
            img1.Invalidate();
            
        }

        private void CollisionCheck()
        {
            
        }

        private void img1_Paint(object sender, PaintEventArgs e)
        {
            Graphics g = e.Graphics;
            g.DrawImage(uno, new Rectangle(x, y, 250, 250),
                fx + img*250, fy + fila * 250, 250, 250, GraphicsUnit.Pixel);
        }

        private void Form1_KeyUp(object sender, KeyEventArgs e)
        {
            fila = 0;
        }

        private void Form1_KeyPress(object sender, KeyPressEventArgs e)
        {
            Console.WriteLine("Caminar");
            int distancia = (int)(vel * tiempo);
            if(e.KeyChar == 'a')
            {
                x -= distancia;
                fila = 1;
            }

            if(e.KeyChar == 'd')
            {
                x += distancia;
                fila = 1;
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }        

        private void img1_Click(object sender, EventArgs e)
        {

        }
    }
}
