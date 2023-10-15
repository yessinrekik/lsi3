package Server;


import java.io.*;
import java.net.*;


public class Server {
	public static void main(String[]args)  {
		try {
			
		System.out.println("je suis un serveur");
		
		//ouverture socket serveur
		ServerSocket serverSocket=new ServerSocket(1234);
		System.out.println("waiting");
		
		//attendre une tentative de connexion et l'accepter
		Socket socket=serverSocket.accept();
		System.out.println("connected");
		
		//recevoir information du client
		InputStream is = socket.getInputStream();
		OutputStream os=socket.getOutputStream();
		
		InputStreamReader isr= new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		int nb1= Integer.parseInt(br.readLine());

		int nb2=Integer.parseInt(br.readLine());

		String op=br.readLine();
		
		
		
		//traitement donnees
		int res=0;
		switch(op) {
		case "+":
			res=nb1+nb2;
			break;
		case "-":
			res=nb1-nb2;
			break;
		case "*":
			res=nb1*nb2;
			break;
		case "/":
			res= nb1/nb2;
			break;
		}
		PrintWriter pw= new PrintWriter(os,true);

		//envoyer donnees traitees
		pw.println(Integer.toString(res));
		
		//fermuture socket serveur
		serverSocket.close();
	}catch(IOException e){
		e.printStackTrace();
	}
		}

	}

