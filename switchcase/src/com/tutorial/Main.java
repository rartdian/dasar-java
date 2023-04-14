package com.tutorial;

import java.util.*;

public class Main {

	public static void main(String[] args) {
	
		String input;
		Scanner inputUser = new Scanner(System.in);
	
		System.out.print("panggil nama: ");
		input = inputUser.next();
		
		//ekspresinya berupa satuan (int, long, byte, short), String atau enum
		switch (input) {
		case "delisha":
			System.out.println("halo nama saya delisha");
			break;
		case "fiza":
			System.out.println("halo nama saya fizaz");
			break;
		case "Adi":
			System.out.println("halo nama saya adi");
			break;
		default:
			System.out.println(input + " tidak hadir");
		}
		System.out.println("program selesai");
	}

}
