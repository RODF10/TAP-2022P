package Practicas.Java.Practica3.Tiempo;

import java.net.*;

public class TiempoDeCarga {
    public int carga(String host){//obtencion de tiempo de carga
        try {
            Socket socket = new Socket(host, 65535);
            int tiempo = socket.getSoTimeout();
            return tiempo;
        } catch (Exception e) {
        }
        return 0;
    }    
}
