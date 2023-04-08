package com.tutorial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Program menghitung luas persegi panjang");
		
		int panjang, luas, lebar, tinggi, volume;
		
		System.out.print("Panjang = ");
		panjang = userInput.nextInt();
		System.out.print("lebar = ");
		lebar = userInput.nextInt();
		luas = panjang * lebar;
		System.out.println("luas = "+ luas);
	}

}
