package com.tutorial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *Operator Bitwise adalah sebuah operator untuk melakukan operasi pada nilai bit  
 * */
		
		
	byte x = 1;
	String x_bits;
							//%8s menampilkan 8 string byte
	x_bits = String.format("%8s", Integer.toBinaryString(x));
	System.out.printf("nilai bit %s = nilai desimal %d \n", x_bits, x);
	
	byte a = 1;
	byte b, c;
	String a_bits, b_bits, c_bits;
	
	System.out.println("-------> ''''Shift Left (<<)'''' <-------");
	a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
	System.out.printf("%s = %d \n", a_bits, a);
	
	b = (byte)(a << 2);
	b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ','0');
	System.out.printf("%s = %d \n", b_bits, b);
	}

}
