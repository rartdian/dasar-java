package com.tutorial;

public class Main {

	public static void main(String[] args) { //fungsi utama yg akan dipanggil
	
		// y = (x + 2) * x
		
				int y, x;
				
				x = 5;
				y = hitung(x);
				
				System.out.println("x = "+ x + ", y = "+ y);
				
				x = 20;
				y = hitung(x);
				System.out.println("x = "+ x + ", y ="+ y);
				
				x = 40;
				y = hitung(x);
				System.out.println("x = "+ x +", y = "+ y);
				
				
				
	}
	//apa kegunaan method didalam class?
	// private static digunakan saat didalam class yang sama
	private static int hitung(int input) {
	//public static int hitung(int input) {
		// fungsi : 
		int hasil;
		
		hasil = input * input;
		
		return hasil;
	}
}
