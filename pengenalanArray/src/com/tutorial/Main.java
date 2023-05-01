package com.tutorial;

// java ada helper class, khusus untuk array
import java.util.Arrays; //bisa merubah array menjadi string dengan library ini

public class Main {

	public static void main(String[] args) {
		
		//assignment
		System.out.println("assignment array");
		//tipedata [] nama = {komponen komponen};
		int[] arrayinteger= {1, 2, 3};
		//komponen array dimulai dari 0
		System.out.println(arrayinteger); //akan keluar addressnya posisi memory alokasi tipe stack |||||||
		System.out.println(arrayinteger[2]);

		
		//deklarasi
		//tipedata[] nama = new int[jumlah array];
		//array di java adalah objek
		System.out.println("array deklarasi"); 
		
		int[] deklarasiarray = new int[5];
		deklarasiarray[2] = 9; //rubah index ke 2 menjadi 9
		for(int i=0; i<=4;i++) {	
			System.out.println(deklarasiarray[i]);
		}
		
		System.out.println(Arrays.toString(arrayinteger));
		
		System.out.println(Arrays.toString(deklarasiarray));
		
		
		System.out.println("\n deklarasi array float");
		float[] deklarasiArrayFloat = new float[6];
		deklarasiArrayFloat[0] = 5.9f;
		
		System.out.println(deklarasiArrayFloat[0]);
	}

}
