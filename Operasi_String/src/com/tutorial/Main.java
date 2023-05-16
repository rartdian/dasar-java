package com.tutorial;
import java.util.Scanner;
import java.lang.String;
public class Main {

	public static void main(String[] args) {
		//COmpare, membandingkan
		String nama1 = "rio";
		String nama2 = "lisa";
		System.out.println(nama1.compareTo(nama2)); //hasilnya rio 6 langkah dari lisa, jarak antara alpabet nya
//abcdefghijk l,m,n,o,p,q, =6, r stuvwxyz
		
		
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
		
		
		//setiap membuat string baru maka disimpan dalam memory yg baru.
//		merubah kata
		String kalimat4 = kalimat.replace("Pisang", "Melon");
	System.out.println(kalimat);
	System.out.println(kalimat4);
	
	//cek persamaaan dua buah string
//	string itu yg di cek adalah address nya
	String input = new String("coba"); // hasil akan tidak sama, karena yg di cek pada String adalah Address nya bukan isinya
	// sehingga dg string mempunyai satu buah method untuk cek isinya bukan Addressnya
//	jika string mengambil dari user maka memory berada pada heap, bukan literal atau string pool 
	String input2 = "coba";
	
	System.out.println("\ncek Address String");
	if( input == input2) {
		System.out.println("sama");
	}else {
		System.out.println("tidak sama");
	}
	
	Scanner userInput = new Scanner(System.in);
	System.out.print("mengambil input String dari User");
	input = userInput.next(); //disimpan tidak di string pool
	System.out.println("ini adalah input dari user: "+input);
	
	if(input == input2) {
		System.out.println("sama");
	} else {
		System.out.println("tidak sama");
	} 
	//hasil dari user akan tidak sama karena String dari user masuk di heap, tidak di string pool
	//sehingga untuk cek isi pada string dengan equals
	System.out.println("cek dengan lib equals");
	if(input.equals(input2)) {
		System.out.println("sama");
	}else {
		System.out.println("tidak sama");
		
	}
	
	
	
	}

}
