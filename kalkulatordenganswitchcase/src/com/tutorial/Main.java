package com.tutorial;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		String operator;
		float hasil, a, b;
		Scanner inputUser;
		
	inputUser = new Scanner(System.in);
		
		System.out.println("program kalkulator dengan switch case");
		
		System.out.print("masukkan nilai a = ");
		a = inputUser.nextFloat();
		
		System.out.println("pilih operator (*, /, +, -)");
		operator = inputUser.next();
		
		System.out.println("masukkan nilai b = ");
		b = inputUser.nextFloat();
		
		switch (operator) {
		case "*": {
			hasil	= a * b;
			System.out.println("hasilnya= " +hasil);
			break;
		}
		case "/": {
			hasil = a / b;
			System.out.println("hasilnya = "+ hasil);
			break;
		}
		case "+":{
			hasil = a + b;
			System.out.println("hasil= "+hasil);
			break;
		}
		case "-":{
			hasil = a - b;
			System.out.println("hasil = "+hasil);
			break;
		}
		
		default:
			System.out.println("operator tidak ditemukkan ");
		}
	}

}
