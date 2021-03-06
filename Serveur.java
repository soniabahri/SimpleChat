import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {
    ServerSocket server ;
    Socket ss;
    PrintWriter pw;

    public Serveur(){
        connect();
        if(ss.isConnected()){
            new DialogueServer(ss);
        }
    }

    void connect(){
        System.out.println("Demarrage serveur .... ");
        try {
            server = new ServerSocket(9000);
            ss = server.accept();
        } catch (IOException e) {
            System.out.println("Erreur server ?  "+e.getMessage());
        }
    }
    

    public static void main(String[] args) {

        new Serveur();
    }
}
