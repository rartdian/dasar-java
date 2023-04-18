package com.tutorial;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		String input;
		int nilai_awal, nilai_akhir,total;
		
		Scanner inputUser = new Scanner(System.in);
		System.out.println("awal program");
		System.out.println("pilih untuk for, do while, while: A, B, C");
		input = inputUser.next();
		System.out.print("masukkan nilai awal: ");
		nilai_awal = inputUser.nextInt();
		System.out.print("masukkan nilai akhir: ");
		nilai_akhir = inputUser.nextInt();
		
		
		switch (input) {
		case "A": {
			total = 0;
			for(;nilai_awal <= nilai_akhir;) {
				
				total = total+nilai_awal;
				System.out.println("ditambah "+ nilai_awal + " = " + total);
				
				nilai_awal++;
			
			}
			
		}
		case "B":{
			total = 0;
			while (nilai_awal <= nilai_akhir) {
				total = total + nilai_awal;
			nilai_awal++;
			
			System.out.println("ditambah "+nilai_awal +" = "+ total);
			}
		}
		break;
		case "C":{
			total = 0;
			do {
				total = total + nilai_awal;
				System.out.println("ditambah "+ nilai_awal + " = "+total);
				nilai_awal++;
			} while (nilai_awal <= nilai_akhir);
		}
		
		
		default:
			System.out.println("pilihan tidak ada.");
		}
		
		}

	}


