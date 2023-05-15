package com.tutorial;
import java.util.Scanner;
import java.lang.String;
public class Main {

	public static void main(String[] args) {
		String kalimat  = "Saya Suka Makan Pisang";
		//mengambil komponen dari String
		System.out.println(kalimat.charAt(9));
		
		
		//substring mengambil kata
		String kata = kalimat.substring(5,9) ;//disimpan di memory heap
		System.out.println(kata);
	
		//menggabungkan dua buah string, concatenation
		String kalimat2 = kata + " juice";
		System.out.println(kalimat2);
		
		kata = kata + " minum"; //simpan di memory string pool
		System.out.println(kata);
		
		//concat dengan non String
		int nilai = 100;
		String kalimat3 = kata + " " + nilai; //auto dirubah nilai menjadi string atau casting dari int menjadi string
		System.out.println(kalimat3);
		System.out.println(kata + " "+nilai ); // casting juga ,dirubah ke string lalu di print, karena print hanya bisa untuk string aja.
		
//		membuat kalimat menjadi kapital UPPercase
		System.out.println(kalimat.toUpperCase());
		System.out.println(kalimat.toLowerCase());
		
	
	}

}
