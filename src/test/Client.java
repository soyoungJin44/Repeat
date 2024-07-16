package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {
	
	public static void main(String[] args) throws IOException{
		
		Socket socket = new Socket();
		System.out.println("클라이언트 시작");
		
		socket.connect(new InetSocketAddress("192.168.0.52", 10001));
		System.out.println("연결을 시작합니다.");
		
		OutputStream out = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
		
		BufferedWriter bw = new BufferedWriter(osw);
		
		InputStream in = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(in,"UTF-8");
		
		BufferedReader br = new BufferedReader(isr);
		
		InputStream sc = System.in;
		InputStreamReader scr = new InputStreamReader(sc,"UTF-8");
		BufferedReader sbr = new BufferedReader(scr);
		
		
		
		while(true) {
			System.out.println("입력");
			String str = sbr.readLine();
			
			if("/q".equals(str)) {
				break;
			}
			
			bw.write(str);
			bw.newLine();
			bw.flush();
			
		}//while
		bw.close();
		br.close();
		socket.close();
		sbr.close();
		
	}//main

}
