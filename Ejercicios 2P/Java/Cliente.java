import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cliente {
    public static void main(String args[])throws UnknownHostException, IOException{
        Socket c = new Socket("127.0.0.1", 5000);
        BufferedReader in = new BufferedReader(new InputStreamReader(c.getInputStream));
        BufferedReader internal_read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(c.getOutputStream());
        String asnwer = "";
        do{
            System.out.println("Escirba su mensaje");
            String line = internal_read.readLine();
            out.print(line);
            out.flush();
            asnwer = in.readLine();
            System.out.println("Ya me contestaron "+asnwer);
        }while(!asnwer.equals("bye"));
        
        c.close();
        
    }

}
