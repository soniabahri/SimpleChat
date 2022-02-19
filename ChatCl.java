

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatCl extends Thread{
    Socket s ;
    public ChatCl(Socket s) {
        this.s=s ;
    }

    @Override
    public void run() {


            PrintWriter pw = null;
            try {
                pw = new PrintWriter(s.getOutputStream());
                //s.getOutputStream() flux de sortie
                pw.println("envoyer votre id ! ");
                pw.flush(); //envoie
                InputStreamReader input = new InputStreamReader(s.getInputStream());
                BufferedReader br = new BufferedReader(input);
                String ligne = br.readLine();
                System.out.println(ligne);

            } catch (IOException e) {
                e.printStackTrace();
            }





} }
