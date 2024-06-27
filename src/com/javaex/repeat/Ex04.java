package com.javaex.repeat;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int count = 1;
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("숫자를 입력하세요");
		
		while(count <= 5) {
			System.out.print("숫자: ");
			num2 = sc.nextInt();
			
			count++;
			
			if(num1 < num2) {
				num1 = num2;
			}
		}
		System.out.println("최대값은 " + num2 + "입니다.");
	}

}
