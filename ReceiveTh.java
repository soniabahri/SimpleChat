
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ReceiveTh extends Thread{

    Socket s ;
    private PrintWriter pw;

    public ReceiveTh(Socket s) {
        this.s=s ;
    }

    public void run() {
    while (true) {

        try {
            InputStreamReader input = new InputStreamReader(s.getInputStream());
            BufferedReader br = new BufferedReader(input);
            String ligne = br.readLine();
            System.out.println(ligne);
            pw = new PrintWriter(s.getOutputStream());
            //s.getOutputStream() flux de sortie
            pw.println(s.getOutputStream());
            pw.flush(); //envoie


        } catch (IOException e) {
            e.printStackTrace();
        }
} } }
