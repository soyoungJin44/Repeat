package com.javaex.repeat;

public class Ex03 {

	public static void main(String[] args) {
		//no.9
		
		for(int i = 1; i <=10; i++) {
			for(int a = i; a <= (9+i); a++) {
				System.out.print(a);
				System.out.print("	");
			}
			System.out.println("");
		}
	}

}
