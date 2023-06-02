package com.tutorial;
import java.util.Scanner;
public class Main {

	
	//chaining atau merantaikan exception
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
		
		//Exception di dalam fungsi
		System.out.println("\n\nException didalam fungsi");
		int data = mengambilDariArray(arrayData,indexInput);
		System.out.printf("data dari array ke-> %d adalah %d\n\n", indexInput, data);
		
		
		
		//tipe lain dari exception
		//exception throws by method
		System.out.println("Exception throws by method");
		int datakedua = 0;
		try {
			datakedua = ambilData(arrayData,indexInput);
		} catch (Exception e) {
			System.err.println(e);
		}
		System.out.printf("data dari array ke-%d adalah %d\n\n", indexInput, datakedua);
		
		//System.out.println("\n\nakhir program");
	}
	
	private static int ambilData(int[] array, int index) throws Exception{
		int hasil = array[index];
		return hasil;
	}
	
	private static int mengambilDariArray(int[] array, int index) {
		int hasil = 0;
		
		try {
			hasil = array[index];
			
		} catch (Exception e) {
			System.err.println(e);
		}
		return hasil;
	}

}
