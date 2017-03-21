package exemploSocket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exemplo {

    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(8090);){
            
            Socket socket = server.accept();
            Scanner scan = new Scanner(socket.getInputStream());
            while(scan.hasNext()){
                String linha = scan.nextLine();
                System.out.println(linha);
            }
        } catch (IOException ex) {
            Logger.getLogger(Exemplo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
