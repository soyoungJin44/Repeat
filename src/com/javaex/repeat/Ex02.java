package com.javaex.repeat;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//NO.8 구구단 가로열로 만들기
		
		for(int d = 1; d<=9; d++) {
			for(int h =2; h <=9; h++) {
				System.out.print(h + "*" + d + "=" + (h*d));
				System.out.print("	");
			}System.out.println("");
		}
		
		
}
}