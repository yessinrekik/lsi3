package objcs;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class client {
public static void main(String[] args)  {
		
		try{
			System.out.println("je suis un client");
		   Socket socket=new Socket("Localhost",1234); // une socket va etre crée
		   // localhost c'est la machine du client et 1234 c'est le port
		   //cette instruction est pour la demande de connexion de client au serveur
		   System.out.println("je suis un client connecté");
		   InputStream is = socket.getInputStream(); // elle lu le flux qui est dans le port 1234
		   OutputStream os = socket.getOutputStream(); // elle fait sortie le contenue de is et le renvoi au serveur
		   ObjectOutputStream oos = new ObjectOutputStream(os);
		   operation op= new operation(5,6,'+');
		   oos.writeObject(op);
		   ObjectInputStream ois= new ObjectInputStream(is);
		   operation opp  =(operation)ois.readObject();
		   System.out.println("le resultat de "+opp.getOp1()+opp.getOperation()+opp.getOp2()+"est egale à"+opp.getResult() );
		   System.out.println("deconnexion client");
		       socket.close();
		}
		catch(Exception e) {e.printStackTrace();};
		}
}
