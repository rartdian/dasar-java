package com.tutorial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Operator Logika ---->>>> OPerasi yang digunakan kepada tipe data boolean
		 * 
		 * AND, OR, XOR, NEGASI
		 * 
		 * boolean = true--->1, false--->0;
		 * 
		 * OR || = true -> false = true
		 * 		   true -> true = true
		 * 		   seperti penjumlahan, jk hasilnya 1 maka true
		 * contoh table OR
		 * 
		 * a b = c
		 * ======
		 * 0 0 = 0 false
		 * 0 1 = 1 true
		 * 1 0 = 1 true
		 * 1 1 = 1 true
		 * 
		 * AND && = true -> false = false
		 * 		    true -> true => true
		 * 		    false -> true = false
		 * 		    seperti perkalian, jika hasilnya 0 maka false
		 * 
		 * contoh tabel AND
		 * a b = c
		 * ========
		 * 0 0 = 0 = false
		 * 0 1 = 0 = false
		 * 1 0 = 0 = false
		 * 1 1 = 1 = true
		 * 
		 * XOR ^ = Exclusive OR
		 * 		 hasil akan true jika nilai a dan b berbeda,
		 * 		 hasil akan false jika nilai a dan b sama
		 * 
		 * contoh tabel XOR
		 * a b = c
		 * 0 0 = 0 false
		 * 0 1 = 1 true 
		 * 1 0 = 1 true
		 * 1 1 = 0 false
		 * 
		 * 
		 * NOT, negasi, mengembalikkan sebuah nilai (!)
		 * */
		
		System.out.println("=========OR (||)===========");
		boolean a, b, c;
		a = false;
		b = false;
		c = (a||b);
		System.out.println(a + "||" + b + " = " + c);
		
		System.out.println("=========AND (&&)===========");
		a = false;
		b = true;
		c = (a && b);
		System.out.println(a + " && " + b + " = " + c);
		
		System.out.println("=========XOR (^)===========");
		a = true;
		b = false;
		c = (a ^ b);
		System.out.println(a + " ^ " + b + " = " + c);
		
		System.out.println("=========NOT (!)===========");
		a = true; 
		b = !a;
		System.out.println(a + " ---->>>> (!) = " + b);
	}

}
