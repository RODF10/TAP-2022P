namespace HolaMundo
{
    partial class Form1
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
            this.btn_aceptar = new System.Windows.Forms.Button();
            this.txt_in = new System.Windows.Forms.TextBox();
            this.btn_ig = new System.Windows.Forms.Button();
            this.txt_result = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // btn_aceptar
            // 
            this.btn_aceptar.Location = new System.Drawing.Point(585, 30);
            this.btn_aceptar.Name = "btn_aceptar";
            this.btn_aceptar.Size = new System.Drawing.Size(75, 23);
            this.btn_aceptar.TabIndex = 0;
            this.btn_aceptar.Text = "Aceptar";
            this.btn_aceptar.UseVisualStyleBackColor = true;
            this.btn_aceptar.Click += new System.EventHandler(this.btn_aceptar_Click);
            // 
            // txt_in
            // 
            this.txt_in.Location = new System.Drawing.Point(93, 30);
            this.txt_in.Name = "txt_in";
            this.txt_in.Size = new System.Drawing.Size(443, 20);
            this.txt_in.TabIndex = 1;
            // 
            // btn_ig
            // 
            this.btn_ig.Location = new System.Drawing.Point(692, 30);
            this.btn_ig.Name = "btn_ig";
            this.btn_ig.Size = new System.Drawing.Size(39, 23);
            this.btn_ig.TabIndex = 2;
            this.btn_ig.Text = "=";
            this.btn_ig.UseVisualStyleBackColor = true;
            this.btn_ig.Click += new System.EventHandler(this.btn_ig_Click);
            // 
            // txt_result
            // 
            this.txt_result.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_result.Location = new System.Drawing.Point(93, 83);
            this.txt_result.Multiline = true;
            this.txt_result.Name = "txt_result";
            this.txt_result.Size = new System.Drawing.Size(638, 339);
            this.txt_result.TabIndex = 3;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.txt_result);
            this.Controls.Add(this.btn_ig);
            this.Controls.Add(this.txt_in);
            this.Controls.Add(this.btn_aceptar);
            this.Name = "Form1";
            this.Text = "HolaMundo";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button btn_aceptar;
        private System.Windows.Forms.TextBox txt_in;
        private System.Windows.Forms.Button btn_ig;
        private System.Windows.Forms.TextBox txt_result;
    }
}

