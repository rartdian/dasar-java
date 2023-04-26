package com.tutorial;

public class Main {

	public static void main(String[] args) {
		//void artinya hampa atau kosong
		
		System.out.println(delisha());
		fungsivoid("apapun");
		fungsitanpakembalian("Delisha");
	}
	
	
	private static void fungsitanpakembalian(String nama) {//tidak perlu mengambil hasilnya
		System.out.println("hai "+ nama);
	}
	
	private static void fungsivoid(String input) { //fungsi atau method yang tanpa return
										//fungsi ini untuk melakukan kegiatan saja misal perhitungan tanpa kembalian
										//hanya mendelegasikan aksi saja tanpa mengambil sebuah nilai
		
		System.out.println(input);
		
		
	}
	
	private static float delisha() { //ini adalah fungsi atau method dengan kembalian return
		//ssehingga menggunakan return untuk mengembalikan nilai
		return 0.618f;
	}

}
