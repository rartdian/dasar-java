package com.tutorial;
import java.util.Arrays;

//tipe data fundamental, int, double, float, boolean, char
//string -> tipe data high level= karena bisa melakukan operasi method khususs
//jika char pakai petik satu ' ,  jika string pakaki oetik dua "

public class Main {

	public static void main(String[] args) {

		//membuat string
		String Kalimat = "SelamatPagiDunia";
		
		char[] ArrayKalimat = {'s','e','l','a','m','a','t','p','a','g','i','d','u','n','i','a'};
		
		//menampilkan string
		System.out.println(Kalimat);
		
		System.out.println(Arrays.toString(ArrayKalimat));
		
		//didalam string ada char juga
		System.out.println("komponen pertama dari String "+Kalimat.charAt(2));
		System.out.println("komponen pertama dari char "+ArrayKalimat[0]);

	//string dijava tidak bisa merubah nilainya karena string untuk membaca input darin user, compare, merubah nama jarang dilakukan
		
		//bisa merubah komponen secara tidak langsung, dengan substring
		//string di java itu immutable
		// string yg ada di string pool itu akan reuseable, memory lebih efisien
		//membuat string dengan method baru, maka dia akan ditaruh dimemory lain tidak di string pool
		
		
		System.out.println("1"+Kalimat.substring(0,7)); //mengambil string darri 0sampai batas kata ke 7
		char x = ArrayKalimat[0] = 'g';
		System.out.println("2"+ x);
		System.out.println("3"+ArrayKalimat);
		String ambilstring = Arrays.toString(ArrayKalimat);
		System.out.println("4"+ambilstring.substring(2));
		
		CetakAlamat("5"+"kalimat", Kalimat);
	
		System.out.println("\n");
		
		String a = "hallo delisha";
		
		//memori di java ada 3: Heap, Stat, String pool->>khusus untuk string
		CetakAlamat("strin tes alamat var ke-1", a);
		String kata="hallo delisha";
		System.out.println(kata.charAt(3));
		
		System.out.println(kata);
		CetakAlamat("string tes alamat var ke-2", kata);
		
//		string memori di string pool kata yg sama akan di gunakan kembali, shg memori lebih efisien
	}
	
	private static void CetakAlamat(String nama, String data) {
		int address = System.identityHashCode(data);
		System.out.println(nama + " = "+data+ "\t|| address = " + Integer.toHexString(address));
	}

}
