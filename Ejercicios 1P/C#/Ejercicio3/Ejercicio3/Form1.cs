using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Ejercicio3
{
    public partial class Ej3 : Form
    {
        public Ej3()
        {
            InitializeComponent();
        }

        private void txt_in_TextChanged(object sender, EventArgs e)
        {
            TextBox txt_in = (TextBox)sender;
            if (txt_in.Text.Length < 0) return;
            bool isRight = Double.TryParse(txt_in.Text, out double _);

            if (!isRight)
            {
                MessageBox.Show("Dato Inválido");
                String res = "";
                for(int i = 0; i < txt_in.Text.Length; i++)
                {
                    if(txt_in.Text[i] >= '0' && txt_in.Text[i] <= '9')
                    {
                        res += txt_in.Text[i];
                    }
                }
                txt_in.Text = res;
            }

            /*
            char last = txt_in.Text[txt_in.Text.Length - 1];
            if(!(last >= '0' && last <= '9'))
            {
                MessageBox.Show("Dato Inválido");
                txt_in.Text = txt_in.Text.Remove(txt_in.Text.Length - 1);
            }*/
        }

        private void txt_in_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (!Char.IsDigit(e.KeyChar) || !(e.KeyChar == '.'))
            {
                e.Handled = false;
            }
        }
    }
}
