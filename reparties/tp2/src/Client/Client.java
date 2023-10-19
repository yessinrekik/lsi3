package Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("trying to connect");
			//tentative de connexion vers le serveur localhost port 1234
			
			
			//specification du machine serveur
			InetAddress id = InetAddress.getByName("192.168.43.29");
			
			//specification du socket et port
			InetSocketAddress isd = new InetSocketAddress(id, 1234);
			
			//socket pour echange d'informations
			Socket s = new Socket();
						
			//tentative de connexion - attendre l'accept du serveur 
			s.connect(isd);
			
			System.out.println("connected");
			
			Scanner k = new Scanner(System.in);
			
			//lire donnee utilisateur (methode)
			String w;
			do {
				System.out.println("enter method (+, -, *, /): ");
				w = k.nextLine();
			} while (!(w.equals("+") || w.equals("-") || w.equals("*") || w.equals("/")));
			
			
			//lire les 2 nombre en prenant compte les cas elaborees
			System.out.println("enter nb a: ");
			int nb1 = k.nextInt();
			System.out.println("enter nb b: ");
			int nb2 = 0;
			if( w.equals("/")) {
				do {
					System.out.println("enter nb b: ");
					nb2 = k.nextInt();
				} while (nb2 ==0);
			} else {
				nb2=k.nextInt();
			}
			
			//declaration OS pour echange donness
			OutputStream os = s.getOutputStream();
			
			//printwriter = methode d'ecriture
			PrintWriter pw = new PrintWriter(os, true);
			
			
			//envoyer 3 valeurs differens
			pw.println(nb1);
			pw.println(nb2);
			pw.println(w);
			
			//recevoir les donnees envoyees par le serveur
			InputStream is = s.getInputStream();
			
			//reader et buffer pour passer information > 1octet
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			System.out.println(nb1 + w + nb2 + "=" + br.readLine());
			
			//fermuture socket
			s.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
