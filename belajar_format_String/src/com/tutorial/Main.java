package com.tutorial;

public class Main {

	public static void main(String[] args) {
	String nama = "Rio";
	int umur	= 5;
		
	System.out.println("Nama saya adalah "+ nama + ",umur saya adalah " + umur);
	
	
	//cara lain dengan format strign
	System.out.printf("Nama saya adalah %s, umur saya adalah %d\n",nama,umur);
	
	// conversion : f=floating point, d=integer, c= character, s=string, b=boolean
	// struktur format = %[argumen_index$][flags][width][.precision]conversion
	
	//[argumen_index$]
	System.out.println("\n[argumen_index$]");
	
	//udin, wahai udin, kemana saja kamu udin
	System.out.printf("%1$s, wahai %1$s, kemana saja kamu %1$s?\n",nama);
	//umur rio berapa?, rio menjawab: 5, wah masih muda ya umurnya 5
	System.out.printf("\n umur %1$s berapa?, \n%1$s menjawab: %2$d \nWah masih muda ya umurnya %2$d\n",nama,umur);
	
	//[flags]
	System.out.println("\n[flags]");
	int int1 = 5;
	int int2 = 8;
	int hasil = int1 - int2;
	System.out.printf("%d - %d = %+d\n",int1, int2, hasil);
	
	//[width]
	System.out.println("\nWidth");
	int int3 = 1000;
	System.out.println("Integer");
	System.out.printf("%d\n ",int3);
	System.out.printf("%5d\n", int3);
	System.out.printf("%-5d\n", int3); //flags = "-", artinya rata kiri
	System.out.printf("%+5d\n",int3); //flags akan mengambil slot di dalam format
	System.out.printf("%+-6d\n",int3); //flags bisa digabungkan
	System.out.printf("%10d\n",int3);
	System.out.printf("% 10d\n",int3);
	System.out.printf("%010d\n",int3); //flags = "0",kita tambahkan leading "0" didepan
	System.out.printf("%+010d\n",int3);
	int int4 = 1000000;
	System.out.printf("%-,1d\n",int4);//flags = "0", menandakan delimeter per seribu
	

	
	}

}


