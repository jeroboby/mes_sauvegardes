package Server;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {

	public static void main(String[] args) throws IOException {

		System.out.println("Serveur non opertionnel");
		ServerSocket socketserver = new ServerSocket(9090);
		System.out.println("J'ai ouvert le port 9090");
		Socket communicationAvecClient = socketserver.accept();
		System.out.println("J'ai établi la connection avec le client");
		
		InputStream is = communicationAvecClient.getInputStream();
		/*ObjectInputStream ois = new ObjectInputStream(is);
		
		int a = ois.readInt();
		System.out.println(a);
		int b = ois.readInt();
		System.out.println(b);
		int c = a + b;
		
		OutputStream os = communicationAvecClient.getOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeInt(c);
		oos.flush();
		*/
		while(true)
		{
			int data = is.read();
			if(data == -1)
				break;
			
			System.out.print((char) (data & 0xff));
		}
		communicationAvecClient.close();
		System.out.println("Connection terminée");
		socketserver.close();
	}
}