package main.tutorial;
import java.util.*;

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

System.out.print("nilai Arrayke : ");

int index = input.nextInt();

try {
//baris yg memunculkan exception, harus dibungkus dengan try karena kasus ini input index dari user melebihi index yg ada pada array
	System.out.printf("index array ke %d, bernilai : %d",index, nilaiArray[index]);
} 
	catch (Exception pesanException) {
//	atau bisa juga dengan penulisan 
	//catch (java.lang.ArrayIndexOutOfBoundsException pesanException){
	System.out.println(pesanException);
}
//jika ada exception kita ambil maka diberi nama catch
//catch apapun yg terjadi, yg terjadi adalah ada exception

System.out.printf("akhir program,");
//jika  error exception keluar maka program dibawah tidak dieksekusi
	}
	
}
