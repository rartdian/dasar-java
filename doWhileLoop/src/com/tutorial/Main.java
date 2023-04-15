package com.tutorial;

public class Main {

	public static void main(String[] args) {
	
/*
 * 
 * do {
		aksi
	}while (kondisi);
 * */
		int a=0;
		boolean kondisi = true;
		System.out.println("program do while dimulai");
		do {
			a++;
			System.out.println("ini iterasi ke= "+a);
			if (a == 10) {
				kondisi = false;
			}
			
		} while(kondisi);
		System.out.println("program selesai.");
	}

}
