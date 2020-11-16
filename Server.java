import java.io.*;
import java.net.*;
public class Server{
	public static void main(String[] args) {
		try{
			 // For Server
			ServerSocket ss=new ServerSocket(6666);
			Socket s=ss.accept(); //Establish a connection and accept method wait for the clients
		    DataInputStream dis=new DataInputStream(s.getInputStream());
		    String str=(String)dis.readUTF();
		    System.out.println("message="+str);
		    ss.close();  // Close the Connection
		} catch(Exception e){System.out.println(e);}
	}
}