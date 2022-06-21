using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace HolaMundo
{
    public partial class Form1 : Form
    {
        double total;
        public Form1()
        {
            InitializeComponent();
            total = 0;
        }

        private void btn_aceptar_Click(object sender, EventArgs e)
        {
            //MessageBox.Show("Hola");
            var r = Double.TryParse(txt_in.Text.Trim(), out double temporal);
            if (r)
            { 
                txt_in.Text = "";
                total += temporal;
            } else
            {
                MessageBox.Show("Debe ser un valor");
            }
           
        }

        private void btn_ig_Click(object sender, EventArgs e)
        {
            txt_result.AppendText("Resultado: "+total.ToString());
        }
    }
}
