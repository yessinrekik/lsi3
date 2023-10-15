package serverPackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//reservation port pour ecouter les clients
			ServerSocket sc = new ServerSocket(1234);
			System.out.println("open waiting");
			
			//attender jusqu'a accepter une tentative de connexion d'un client
			Socket s = sc.accept();
			System.out.println("client connected");
			
			//lire et envoyer des donnees entre le client et le serveur(ca)
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			
			int nb = is.read(); //lire entier(recevoir)
			nb*=5;
			int a = nb+3;
			
			os.write(nb);
			os.write(a); //ecrire entier(envoyer)
			
			System.out.println("deconnecting server & client");
			
			//fermer socket et servuer
			s.close();
			sc.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
