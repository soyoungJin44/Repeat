package miniProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class PhoneBook {
	
	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("C:\\javaStudy\\다운폴더\\PhoneDB_원본");
		InputStreamReader isr = new InputStreamReader(in, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream out = new FileOutputStream("C:\\javaStudy\\다운폴더\\PhoneDBPlus");
		OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
		BufferedWriter bw = new BufferedWriter(osw); 
		
		InputStream sc = System.in;
		InputStreamReader sisr = new InputStreamReader(sc);
		BufferedReader sbr = new BufferedReader(sisr);
		
		System.out.println("*********************");
		System.out.println("*  전화번호 관리 프로그램  *");
		System.out.println("*********************");
		
		boolean on = true;
		while(on) {
			System.out.println("1.리스트  2.등록  3.삭제  4.검색  5.종료");
			System.out.println("---------------------------------");
			System.out.print("메뉴");
			String num = sbr.readLine();
			
			switch()
		
		}
		
	}

}
