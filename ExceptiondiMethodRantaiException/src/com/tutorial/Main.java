package com.tutorial;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int[] arrayData = {0,1,2,3};
		Scanner userInput = new Scanner(System.in);
		System.out.print("data ke-> ");
		int indexInput = userInput.nextInt();
		
		
//		bagaimana cara memasukkan try catch ke fugsi/method??
		try {
			System.out.printf("data dari array ke -> %d, adalah %d",indexInput, arrayData[indexInput]);
		}
		catch(Exception e) {
			System.err.println(e);
		}
		
		
		System.out.println("\nakhir program");
	}

}
