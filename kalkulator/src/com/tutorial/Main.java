package com.tutorial;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		// a operator b
		Scanner inputUser;
		float a, b, hasil;
		char operator;
		
		inputUser = new Scanner(System.in);
		
		System.out.println("program kalkulator a operator b,");
		
		System.out.println("masukkan nilai a= ");
		a = inputUser.nextFloat();
		
		System.out.println("pilih operator + - / * = ...");
		operator = inputUser.next().charAt(0);
		
		System.out.println("masukkan nilai b = ");
		b = inputUser.nextFloat();
		
		System.out.println("input user : " + a + " " + operator + " " + b);

		if (operator == '+') {
		 hasil = a + b;
			System.out.println("hasil = " + hasil);
		} else if (operator == '-'){
		 hasil = a - b;
		System.out.println("hasil = "+hasil);
		} else if (operator == '/') {
			hasil = a / b;
		System.out.println("hasil = "+ hasil);
		} else if (operator == '*') {
			hasil=a * b;
		System.out.println("hasil = "+hasil);
		} else {
			System.out.println("operator tidak ditemukan");
		}
	}

}
