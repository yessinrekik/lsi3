package clientPackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("trying to connect");
			//tentative de connexion vers le serveur localhost port 1234
			//Socket s = new Socket("localhost", 1234);
			
			InetAddress id = InetAddress.getByName("192.168.43.29");
			InetSocketAddress isd = new InetSocketAddress(id, 1234);
			Socket s = new Socket();
			s.connect(isd);
			
			System.out.println("connected");
			
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			
			int nb;
			Scanner scanner = new Scanner(System.in);
			nb = scanner.nextInt();
			os.write(nb);
			
			System.out.println(is.read() + "\n" + is.read());
			
			scanner.close();
			s.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
