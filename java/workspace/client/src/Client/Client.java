package Client;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		System.out.println("En attente de la requete du client au serveur");
		Socket socket = new Socket( "127.0.0.1", 9090 );
		System.out.println("Demande de connection du client au serveur");
		OutputStream os = socket.getOutputStream();
		
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeInt(34);
		
		oos.writeInt(7);
		oos.flush();
		
		InputStream iis = socket.getInputStream();
		ObjectInputStream oiis = new ObjectInputStream(iis);
		int res = oiis.readInt();
		System.out.println(res);
		
		socket.close();
		System.out.println("Connection terminée");
	}

}
