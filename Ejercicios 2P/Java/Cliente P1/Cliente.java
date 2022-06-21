import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.net.Socket;
import java.util.logging.Level;

public class Cliente{
    public static void main(String[] args) throws IOException {
        final String HOST = "127.0.0.1";
        final int PUERTO = 5000;
        DataInputStream in;
        DataOutputStream out;

        
        try {

            Socket sc = new Socket(HOST, PUERTO);
            in = new DataInputStream(sc.getOutputStream());
            out = new DataOutputStream(sc.getOutputStream());

            out.writeUTF("Salida del mensaje");
            String mensaje = in.readUTF();
            System.out.print(mensaje);
            sc.close();
            
        } catch (IOException ex) {
            //TODO: handle exception
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}