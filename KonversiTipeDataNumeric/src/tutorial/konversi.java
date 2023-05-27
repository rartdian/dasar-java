package tutorial;

public class konversi {

	public static void main(String[] args) {
		//tipe data
		//byte<short<int<long
		
		// TODO Auto-generated method stub
//konversi dari satu tipe data ke tipe data yg lain
		//memperluas rentang nilai
		//memperkecil rentang nilai dan
		//casting?
		int nilaiInt = 450 ; //32 bit
		
		System.out.println("nilai Integer : " + nilaiInt + " maximal nilai : " + Integer.MAX_VALUE );
	//memperluas tipe data dari int ke long, bisa tidak error karena dari kecil ke besar, javasudah automatis
		long nilaiLong = nilaiInt ;
		System.out.println("nilai long : " + nilaiLong + "max nilai long : " + Long.MAX_VALUE );
		
		//memperkecil rentang ke tipe data yg lebih kecil itu akan menghilangkan tipe data aslinya(casting)
		
		byte nilaiByte = (byte) nilaiInt;
		System.out.println("nilai byte : "+ nilaiByte);
		
		//casting pembagian secara automatis
		
		int a = 8;
		float b = 3; //salah satu tipe data float maka hasil nya float
		
		float hasil = a/b;
		
		System.out.printf("%d / %f = %f ", a, b, hasil);
		
		System.out.println("\n atau \n");
		
		int x = 8;
		int y = 3;
		
		float z = (float) x/y;
		System.out.printf("%d / %d = %f", x, y, z);
		
		
	double inidouble = 5;
	double inidouble2 = 2;
	float iniFloat = (float)((float)inidouble/inidouble2);
	
	System.out.println("\nini float = "+iniFloat);
	}

}
