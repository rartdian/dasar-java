package com.tutorial;

import java.util.*;

public class Main {

public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);

	System.out.print("panjang= "); int inputPanjang = userInput.nextInt();
	System.out.print("lebar=  "); int inputLebar = userInput.nextInt();

	gambar (inputPanjang,inputLebar);
	//luas(inputPanjang, inputLebar);
	tampil(inputPanjang, inputLebar);
}

private static void tampil(int panjang, int lebar) { //function dengan void hanya untuk aksi aja, tidak menghasilkan sesuatu
	System.out.println("luas = "+ luas(panjang, lebar));
	System.out.println("keliling = "+ keliling(panjang, lebar));
}
private static int keliling(int panjang, int lebar) {
	int hasil = (panjang * lebar) * 2;
	return hasil;
}

private static int luas(int panjang, int lebar) {
	int hasil = panjang * lebar;
	//System.out.print(hasil);
	
	return hasil;
	
	
}	
private static void gambar(int panjang, int lebar) { //fungsi dengan void hanya aksi aja, tanpa menghasilkan sesuatu
	for(int i = 0; i<lebar;i++) {
		for(int j = 0; j < panjang; j++) {
			System.out.print("* ");
			}
	System.out.print("\n");
		}
	}
}
