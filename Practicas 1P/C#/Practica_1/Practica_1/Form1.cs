using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Practica_1
{
    public partial class Form1 : Form
    {
        double num1 = 0, num2 = 0;
        char operador;

        public Form1()
        {
            InitializeComponent();
        }

        private void agregarNumero(object sender, EventArgs e)
        {
            var boton = ((Button)sender);

            if (txt_in.Text == "0")
                txt_in.Text = "";


            txt_in.Text += boton.Text;
        }

        private void btn_igual_Click(object sender, EventArgs e)
        {
            num2 = Convert.ToDouble(txt_in.Text);
            
            if(operador == '+')
            {
                txt_in.Text = (num1 + num2).ToString();
                num1 = Convert.ToDouble(txt_in.Text);
            }

            else if (operador == '-')
            {
                txt_in.Text = (num1 - num2).ToString();
                num1 = Convert.ToDouble(txt_in.Text);
            }
            else if (operador == '*')
            {
                txt_in.Text = (num1 * num2).ToString();
                num1 = Convert.ToDouble(txt_in.Text);
            }
            else if (operador == '/')
            {
                if(txt_in.Text != "0")
                {
                    txt_in.Text = (num1 / num2).ToString();
                    num1 = Convert.ToDouble(txt_in.Text);
                }
                else
                {
                    MessageBox.Show("Math Error");
                }
                
            }

        }

        private void btn_back_Click(object sender, EventArgs e)
        {
            if(txt_in.Text.Length > 1)
            {
                txt_in.Text = txt_in.Text.Substring(0, txt_in.Text.Length - 1);
            } 
            else
            {
                txt_in.Text = "0";
            }
        }

        private void btn_reset_Click(object sender, EventArgs e)
        {
            num1 = 0;
            num2 = 0;
            operador = '\0';
            txt_in.Text = "0";
        }

        private void btn_point_Click(object sender, EventArgs e)
        {
            if (!txt_in.Text.Contains("."))
            {
                txt_in.Text += ".";
            }
        }

        private void btn_delete_Click(object sender, EventArgs e)
        {
            txt_in.Text = "0";
        }

        private void clickOperador(object sender, EventArgs e)
        {
            var boton = ((Button)sender);

            num1 = Convert.ToDouble(txt_in.Text);
            operador = Convert.ToChar(boton.Text);

            txt_in.Text = "0";
        }

    }
}
