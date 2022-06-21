namespace Ejercicio3
{
    partial class Ej3
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.aceptar = new System.Windows.Forms.Button();
            this.ig = new System.Windows.Forms.Button();
            this.txt_in = new System.Windows.Forms.TextBox();
            this.result = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // aceptar
            // 
            this.aceptar.Font = new System.Drawing.Font("Microsoft Sans Serif", 8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.aceptar.Location = new System.Drawing.Point(527, 50);
            this.aceptar.Name = "aceptar";
            this.aceptar.Size = new System.Drawing.Size(79, 23);
            this.aceptar.TabIndex = 0;
            this.aceptar.Text = "Aceptar";
            this.aceptar.UseVisualStyleBackColor = true;
            // 
            // ig
            // 
            this.ig.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.ig.Location = new System.Drawing.Point(630, 50);
            this.ig.Name = "ig";
            this.ig.Size = new System.Drawing.Size(75, 23);
            this.ig.TabIndex = 1;
            this.ig.Text = "=";
            this.ig.UseVisualStyleBackColor = true;
            // 
            // txt_in
            // 
            this.txt_in.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_in.Location = new System.Drawing.Point(72, 50);
            this.txt_in.Name = "txt_in";
            this.txt_in.Size = new System.Drawing.Size(416, 23);
            this.txt_in.TabIndex = 2;
            this.txt_in.TextChanged += new System.EventHandler(this.txt_in_TextChanged);
            this.txt_in.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.txt_in_KeyPress);
            // 
            // result
            // 
            this.result.Font = new System.Drawing.Font("Microsoft Sans Serif", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.result.Location = new System.Drawing.Point(72, 120);
            this.result.Multiline = true;
            this.result.Name = "result";
            this.result.Size = new System.Drawing.Size(646, 276);
            this.result.TabIndex = 2;
            this.result.TextChanged += new System.EventHandler(this.txt_in_TextChanged);
            // 
            // Ej3
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.result);
            this.Controls.Add(this.txt_in);
            this.Controls.Add(this.ig);
            this.Controls.Add(this.aceptar);
            this.Name = "Ej3";
            this.Text = "Ejercicio 3";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button aceptar;
        private System.Windows.Forms.Button ig;
        private System.Windows.Forms.TextBox txt_in;
        private System.Windows.Forms.TextBox result;
    }
}

