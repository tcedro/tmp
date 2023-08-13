package app;

import java.util.Scanner;

public class Main {
	public static int readNumber() {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Entre com valor inteiro:");
		int x = scr.nextInt();
	
		return x;
	}
	
	public static void main(String[] args) {
		int x = readNumber();
		int y = readNumber();
		int result = x + y;
		System.out.println("resultado da soma: " + result);

	}
}
