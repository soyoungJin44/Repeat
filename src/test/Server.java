   package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] args) throws IOException{
	
	ServerSocket serverSocket = new ServerSocket();
	
	serverSocket.bind(new InetSocketAddress("192.168.0.52", 10001));
	System.out.println("연결 기다리는중");
	
	Socket socket = serverSocket.accept();
	System.out.println("연결됨");
	
	InputStream in = socket.getInputStream();
	InputStreamReader isd = new InputStreamReader(in,"UTF-8");
	
	BufferedReader br = new BufferedReader(isd);
	
	OutputStream out = socket.getOutputStream();
	OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
	
	BufferedWriter bw = new BufferedWriter(osw);
	
	while(true) {
		
		String msg = br.readLine();
		System.out.println("받은 메세지: " + msg);
		
		if(msg == null) {
			break;
		}
		
		bw.write(msg);
		bw.newLine();
		bw.flush();
		
		
	}//while
	br.close();
	bw.close();
	socket.close();
	serverSocket.close();
	
	
	}//main
}
