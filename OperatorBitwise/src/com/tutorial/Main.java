package com.tutorial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *Operator Bitwise adalah sebuah operator untuk melakukan operasi pada nilai bit  
 * */
		
		
	byte x = 1;
	String x_bits;
			/*
			 * String.format itu sama saja dengan System.printf namun, 
			 * String.format itu ditampilkan dalam bit%8s menampilkan 8 string bit
			 * */
	x_bits = String.format("%8s", Integer.toBinaryString(x));
	System.out.printf("nilai bit %s = nilai desimal %d \n", x_bits, x);
	
	byte a = 1;
	byte b, c; //untuk tempat hasil operasi dari a
	String a_bits, b_bits, c_bits;
	
	System.out.println("-------> ''''Shift Left (<<)'''' <-------");
	a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
	System.out.printf("%s = %d \n", a_bits, a);
	
	b = (byte)(a << 2); //akan geser 2 step ke kiri
	b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ','0');
	System.out.printf("%s = %d \n", b_bits, b);
	
	//Operator Shift RIght
	System.out.println("-------> ''''Shift Right (>>)'''' <-------");
	a = 126;
	a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
	System.out.printf("%s = %d \n", a_bits, a);
	
	b = (byte) (a>>3);
	b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ','0');
	System.out.printf("%s = %d \n", b_bits, b);
	
	//Operator Bitwise OR
	a = 12;
	b = 10;
	
	System.out.println("-------> ''''Bitwise OR ( | )'''' <-------");
	a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
	System.out.printf("%s = %d \n", a_bits, a);
	
	b_bits = String.format("%8s",  Integer.toBinaryString(b)).replace(' ', '0');
	System.out.printf("%s = %d \n", b_bits, b);
	
	System.out.println("===========================OR");
	
	c = (byte) (a | b);
	c_bits = String.format("%8s",  Integer.toBinaryString(c)).replace(' ', '0');
	System.out.printf("%s = %d \n", c_bits, c);
	
	System.out.println("-------> ''''Bitwise AND ( & )'''' <-------");
	a = 5;
	b = 9;
	//a_bits = 
	System.out.println("-------> ''''Bitwise XOR ( ^ )'''' <-------");
	
	
	System.out.println("-------> ''''Bitwise NOT ( ~ )'''' <-------");
	a = 25;
	b = (byte) (~a);
	a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
	System.out.printf("%s = %d \n", a_bits, a);
	System.out.println("=======================NOT");
	b_bits = String.format("%8s", Integer.toBinaryString(b)).substring(24);
	System.out.printf("%s = %d \n", b_bits, b);
	
	}

}
