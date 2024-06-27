package com.javaex.repeat;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		//반복문 No.7
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int t = 1; t <= i; t++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		
	}
 
}
