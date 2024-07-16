package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class FriendApp {
	
	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("C:\\javaStudy\\MS949.txt");
		InputStreamReader isr = new InputStreamReader(in,"MS949");
		
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream out = new FileOutputStream("C:\\javaStudy\\MS949plus.txt");
		OutputStreamWriter ow = new OutputStreamWriter(out,"MS949");
		
		BufferedWriter bw = new BufferedWriter(ow);
		ArrayList<Friend> friendsList = new ArrayList<Friend>();
		
		
		while(true) {
			String str = br.readLine();
			
			if(str == null) {
				break;
			}
			
			String[] sArray = str.split("#");
			
			Friend result = new Friend(sArray[0],sArray[1],sArray[2]);
			friendsList.add(result);
			
		}
		
	
		for(int i=0;i<friendsList.size();i++) {
			friendsList.get(i).showInfo();
		}
		br.close();
		bw.close();
	}
}

