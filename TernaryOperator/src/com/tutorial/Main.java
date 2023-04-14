package com.tutorial;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		//ternary operator
		int input, x;
		Scanner inputUser = new Scanner(System.in);
	
	System.out.print("masukkan nilai = ");
 	input = inputUser.nextInt();
	
 	//Variable x = ekspresi ? statement_true : statement_false
 	
 	x = (input == 10) ? (input * input) : (input / 2);
 	
 	/*
 	 * jika menggunakan if
 	 * if (input == 10){
 	 * 	x = input * input;
 	 * } else {
 	 *  input / 2 ;
 	 * }
 	 * */
 	
 	System.out.println("hasilnya = "+ x);
 	
	}

}
