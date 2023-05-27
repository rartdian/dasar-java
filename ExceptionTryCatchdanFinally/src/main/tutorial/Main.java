package main.tutorial;

import java.io.FileInputStream;

import java.io.IOException;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	//membuat file atau membuka file butuh exception	
	//error yg terjadi saat program berjalan bukan saat compiling
	//contoh sederhana exception
	//error yg terjadi saat runtime, program berjalan bukan saat compile
		int[] nilaiArray = {
				3,4,52
		};
		
		//System.out.println(nilai[3]);
Scanner input = new Scanner(System.in);
//runtime error jika file tidak ada
FileInputStream fileInput = null; //tipe data fileInputStream namanya fileinput dengan isian masih kosong
System.out.print("nilai Arrayke : ");

int index = input.nextInt();

//exception handling (try, catch, finally)
System.out.println("Handling out of bound");
try {
//baris yg memunculkan exception, harus dibungkus dengan try karena kasus ini input index dari user melebihi index yg ada pada array
	System.out.printf("index array ke %d, bernilai : %d",index, nilaiArray[index]);
} 
	catch (Exception pesanException) {
//	atau bisa juga dengan penulisan 
	//catch (java.lang.ArrayIndexOutOfBoundsException pesanException){  ---->> sama saja dengan penulisan Exception ini adalah subException
	System.out.println(pesanException);
}

//runtime error jika file tidak ada
System.out.println("Handling IO not found");
try {
	fileInput = new FileInputStream("input.exe");
	
}catch (IOException e) {
	System.err.println(e);
}

//menggabungkan dua exception
System.out.println("Menggabungkan dua buah Exception");
try {
	System.out.printf("index ke-%d, adalah %d \n", index, nilaiArray[index]);
	 fileInput = new FileInputStream("input.exe");
}catch (ArrayIndexOutOfBoundsException pesanException) {
	System.err.println("index melebihi jumlah array");
}catch (IOException e) {System.err.println("file tdk ada");}

//jika ada exception kita ambil maka diberi nama catch
//catch apapun yg terjadi, yg terjadi adalah ada exception

System.out.printf("akhir program,");
//jika  error exception keluar maka program dibawah tidak dieksekusi




	}
	
}
