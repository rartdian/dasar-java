package com.tutorial;

import java.util.*;

public class Main {

	public static void main(String[] args) {
	/*
	 * for (inisialisasi; kondisi; step nilai){
	 * 
	 * 				aksi
	 * 
	 * }
	 * */
		
		String  input;
		Scanner inputUser = new Scanner(System.in);
		
		
		System.out.println("pilih pattern: a, b, c, d, e :");
		input = inputUser.next();
		
		switch (input) {
		case "a": {
			//for(inisialisasi;harus true;increment)
			for(int i=0;i<=5;i++) {
				
				System.out.println(i);
				for(int j =0;j<=5;j++) {
					System.out.print(j);
				}
				
				}	
					for (int a= 0;a<=5;a++) {
							
							
							for(int b= a+1;b<=5;b++) {
								System.out.print(b);
								
							}
							System.out.println(a);
					}
		break;
		}
		default:
			System.out.println("pilihan tidak tersedia.");
		}
	
	}
}